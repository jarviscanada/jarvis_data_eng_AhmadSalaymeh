package ca.jrvs.apps.twitter.DAO;

import java.io.IOException;
import java.net.URI;

import javax.management.RuntimeErrorException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.HttpMethod;

import com.github.scribejava.core.exceptions.OAuthException;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;



public class TwitterHttpHelper implements HttpHelper{
    private OAuthConsumer consumer;
    private HttpClient httpClient;


    public TwitterHttpHelper(String consumerKey, String consumerSecret, String accessToken, String tokenSecret){
        consumer = new CommonsHttpOAuthConsumer(consumerKey, consumerSecret);
        consumer.setTokenWithSecret(accessToken, tokenSecret);

        httpClient = new DefaultHttpClient();

    }

    @Override
    public HttpResponse httpPost(URI uri) {
        try{
            return execuHttpRequest(HttpMethod.POST, uri, null);
        }catch (OAuthException | IOException | OAuthMessageSignerException | OAuthExpectationFailedException | OAuthCommunicationException e){
            throw new RuntimeException("Failed to execute",e);
        }

    }

    @Override
    public HttpResponse httpGet(URI uri) {
        try{
            return execuHttpRequest(HttpMethod.GET, uri, null);
        }catch (OAuthException | IOException | OAuthMessageSignerException | OAuthExpectationFailedException | OAuthCommunicationException e){
            throw new RuntimeException("Failed to execute",e);
        }
    }

    private HttpResponse execuHttpRequest(HttpMethod method, URI uri, StringEntity stringEntity) throws OAuthException, IOException, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException{
        if(method==HttpMethod.GET){
            HttpGet request = new HttpGet(uri);
            consumer.sign(request);
            return httpClient.execute(request);
        }else if (method == HttpMethod.POST){
            HttpPost request = new HttpPost(uri);
            if(stringEntity !=null){
                request.setEntity(stringEntity);
            }
            consumer.sign(request);
            return httpClient.execute(request);
        }else{
            throw new IllegalArgumentException("Unkown HTTP Method "+method.name());
        }
    }
    
}
