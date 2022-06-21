package ca.jrvs.apps.twitter.dao.helper;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class TwitterRestHttpHelperTest {
    

    @Test
    public void httpPost() throws Exception{
        String consumerKey = "qaKrqzGFzKDIsyicX48Qpmv0d";
        String consumerSecret = "lJLLcvwQrALzEozOedxK85t5Fi01qpzteQ75HpwCl8cWsb3H9H";
        String accessToken = "1511094511514042371-UKEPrKXnHKegvS9meBLTyWdOtkExcN";
        String tokenSecret =  "2IfWVQiLhEBOrsveaM9PqjePVaHyiq9GlybLT1jJPf7qE";

        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);
        HttpResponse response = httpHelper.httpPost(new URI("https://api.twitter.com/1.1/statuses/update.json?status=testingHelper"));
        System.out.println(EntityUtils.toString(response.getEntity()));

    }
    @Test 
    public void httpGet() throws Exception{
        String consumerKey = "qaKrqzGFzKDIsyicX48Qpmv0d";
        String consumerSecret = "lJLLcvwQrALzEozOedxK85t5Fi01qpzteQ75HpwCl8cWsb3H9H";
        String accessToken = "1511094511514042371-UKEPrKXnHKegvS9meBLTyWdOtkExcN";
        String tokenSecret =  "2IfWVQiLhEBOrsveaM9PqjePVaHyiq9GlybLT1jJPf7qE";

        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);
        HttpResponse response = httpHelper.httpGet(new URI("https://api.twitter.com/1.1/statuses/show.json?id=1539270723356741633"));
        System.out.println(EntityUtils.toString(response.getEntity()));

    }
}
