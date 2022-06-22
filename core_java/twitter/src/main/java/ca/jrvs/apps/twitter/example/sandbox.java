package ca.jrvs.apps.twitter.example;
import ca.jrvs.apps.twitter.dao.TwitterDao;
import ca.jrvs.apps.twitter.dao.helper.HttpHelper;
import ca.jrvs.apps.twitter.dao.helper.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Tweet;
import ca.jrvs.apps.twitter.util.TwitterUtil;


public class sandbox {
    
    public static void main(String[] args) {
        TwitterDao dao;
        String consumerKey = "cWLeTaYYkXv7GHb816yeuoIRO";
        String consumerSecret = "l6pdXvNHfpYMKpveQQb42yWQs1ZA64FxNOgA5tksruNvBSyzkE";
        String accessToken = "1511094511514042371-sE4PFrhtCkBRNZjO2NNve8nlRcEqsN";
        String tokenSecret =  "ZegvEd3cpx6o2DZq3YuSGJwxuO1WwIWWUE34u35HwFxA5";

        
        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);

        dao = new TwitterDao(httpHelper);
        String hastTag = "#abc #test";
        String text ="sometext "+hastTag+" "+System.currentTimeMillis();

        Double lon = 1d;
        Double lat = -1d;

        Tweet tweet = TwitterUtil.buildTweet(text, lon, lat);

        Tweet reposnse = dao.create(tweet);
        System.out.print(reposnse.getEntitles().getHashtags().get(0).getText());
    
        

    }


}
