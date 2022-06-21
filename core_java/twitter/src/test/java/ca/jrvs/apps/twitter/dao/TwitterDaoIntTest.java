package ca.jrvs.apps.twitter.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ca.jrvs.apps.twitter.dao.helper.HttpHelper;
import ca.jrvs.apps.twitter.dao.helper.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Tweet;

public class TwitterDaoIntTest {
    
    private TwitterDao dao;

    @Before
    public void setup(){
        String consumerKey = "qaKrqzGFzKDIsyicX48Qpmv0d";
        String consumerSecret = "lJLLcvwQrALzEozOedxK85t5Fi01qpzteQ75HpwCl8cWsb3H9H";
        String accessToken = "1511094511514042371-UKEPrKXnHKegvS9meBLTyWdOtkExcN";
        String tokenSecret =  "2IfWVQiLhEBOrsveaM9PqjePVaHyiq9GlybLT1jJPf7qE";

        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);
        
        this.dao = new TwitterDao(httpHelper);
    }

    @Test
    public void create() throws Exception{
        String hastTag = "#abc #test";
        String text ="@someone sometext "+hastTag+" "+System.currentTimeMillis();

        Tweet tweet = new Tweet(text);
        Tweet reposnse = dao.create(tweet);

        assertEquals(text, reposnse.getText());
        // assertNotNull(tweet.getCoordinates());
        // assertTrue(hastTag.contains(tweet.getEntitles().getHashtags().get(0).getText()));
    }

    @Test 
    public void read() throws Exception{
        String id = "1539323596388061184";
        Tweet tweet = dao.findById(id);

        assertNotNull(tweet);
        assertEquals(id, tweet.getId_str());


    }

    @Test
    public void delete() throws Exception{
        String id = "1539324352889593856";
        Tweet tweet = dao.deleteById(id);

        assertNotNull(tweet);
        assertEquals(id, tweet.getId_str());
    }

}
