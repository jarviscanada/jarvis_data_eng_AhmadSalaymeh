package ca.jrvs.apps.twitter.dto;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import ca.jrvs.apps.twitter.DAO.HttpHelper;
import ca.jrvs.apps.twitter.DAO.TwitterHttpHelper;

public class TwitterHttpHelperTest {
    
    @Test

    public void HttpPost() throws URISyntaxException, IOException{
        String consumerKey = "n0UhPMm01m1V92wNFUo1H0NtK";
        String consumerSecret =  "Uexbsan5e8MpLuLY6W1w2CjTXDD6FGCVCvIng7yUATRqsUllBF";
        String accessToken = "1511094511514042371-y4oCBvJPHNkE3uuF8ArXZ6iviQs3j0"; 
        String tokenSecret = "wG8RweBySsJehR1QUEIKscpTvSdGfq8qELBj5ngRih9JM";
    
        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);
        
        HttpResponse response = httpHelper.httpPost(new URI("https://api.twitter.com/1.1/statuses/update.json?status=hello_part2"));
        System.out.println(EntityUtils.toString(response.getEntity()));
    }

}
