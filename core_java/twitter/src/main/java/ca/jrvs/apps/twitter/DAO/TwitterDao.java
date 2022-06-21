package ca.jrvs.apps.twitter.DAO;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.google.common.net.PercentEscaper;

import ca.jrvs.apps.twitter.model.Tweet;


public class TwitterDao implements CrdDao< Tweet, String> {
    
    private static final String API_BASE_URI = "https://api.twitter.com";
    private static final String POST_PATH = "/1.1/statuses/update.json";
    private static final String SHOW_PATH = "/1.1/statuses/show.json";
    private static final String DELETE_PATH = "/1.1/statuses/destroy";
    private static final String QUERY_SYM = "?";
    private static final String AMPERSAND = "&";
    private static final String EQUAL ="=";

    private static final int HTTP_OK=200;

    private HttpHelper httpHelper;

    public TwitterDao(HttpHelper httpHelper){
        this.httpHelper=httpHelper;
    }

    @Override
    public Tweet create(Tweet entity) {
        // TODO Auto-generated method stub
        URI uri; 

        uri = getPostUri(entity);
        HttpResponse response = httpHelper.httpPost(uri);
        
        return parseResponseBody(response, HTTP_OK);
    }

    @Override
    public Tweet findById(String id) {
        // TODO Auto-generated method stub
        URI uri = getReadURI(id);

        HttpResponse response = httpHelper.httpGet(uri);

        return parseResponseBody(response, HTTP_OK);
    }

    @Override
    public Tweet deleteById(String id) {
        // TODO Auto-generated method stub
        URI uri = getDeleteURI(id);

        HttpResponse response = httpHelper.httpPost(uri);

        return parseResponseBody(response, HTTP_OK);
    }


    private Tweet parseResponseBody(HttpResponse response, Integer expectedStatusCode){
        Tweet tweet = null;

        int status = response.getStatusLine().getStatusCode();
        if(status != expectedStatusCode){
            try{
                System.out.println(EntityUtils.toString(response.getEntity()));
            }catch(IOException e){
                System.out.println("Response has no entity");
            }
            throw new RuntimeException("Unexpected HTTP status: "+status);
        }

        if(response.getEntity()==null){
            throw new RuntimeException("Empty Response body");
        }

        String jsonString;
        try{
            jsonString =  EntityUtils.toString(response.getEntity());

        }catch(IOException e){
            throw new RuntimeException("unable to convert JSON str to object", e);
        }


        return tweet;
    }

    private URI getPostUri(Tweet entity){
        PercentEscaper percentEscaper = new PercentEscaper("", false);
        String status = entity.getText();
        
        String uriString = API_BASE_URI + POST_PATH + QUERY_SYM + "status"+EQUAL + percentEscaper.escape(status);
        URI uri;
        try {
            uri = new URI(uriString);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            throw new IllegalArgumentException("Cannot create URI - Please Check Tweet input", e);
        }
        return uri;
    }

    private URI getReadURI(String id){
        
        String uriString = API_BASE_URI + SHOW_PATH+QUERY_SYM+"id"+EQUAL+id;
        URI uri;
        try{
            uri = new URI(uriString);
        } catch(URISyntaxException e){
            throw new IllegalArgumentException("Cannot get Tweet - Check ID ", e);
        }

        return uri;
    }

    private URI getDeleteURI(String id){
        String  uriString = API_BASE_URI + DELETE_PATH + id +".json";
        URI uri;
        try{
            uri = new URI(uriString);
        } catch(URISyntaxException e){
            throw new IllegalArgumentException("cannot delete tweet - check id",e);
        }
        return uri;
    }
}
