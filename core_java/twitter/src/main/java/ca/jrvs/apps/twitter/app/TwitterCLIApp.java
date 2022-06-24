package ca.jrvs.apps.twitter.app;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import ca.jrvs.apps.twitter.controller.Controller;
import ca.jrvs.apps.twitter.controller.TwitterController;
import ca.jrvs.apps.twitter.dao.CrdDao;
import ca.jrvs.apps.twitter.dao.TwitterDao;
import ca.jrvs.apps.twitter.dao.helper.HttpHelper;
import ca.jrvs.apps.twitter.dao.helper.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Tweet;
import ca.jrvs.apps.twitter.service.Service;
import ca.jrvs.apps.twitter.service.TwitterService;
import ca.jrvs.apps.twitter.util.JsonParser;

public class TwitterCLIApp {

    public static final String USAGE="USAGE: TwitterCLIApp post|show|delete [options]";

    private Controller controller;


    public TwitterCLIApp(Controller controller ){
        this.controller = controller;
    }

    public static void main(String[] args) {
        
        String consumerKey = "cWLeTaYYkXv7GHb816yeuoIRO";
        String consumerSecret = "l6pdXvNHfpYMKpveQQb42yWQs1ZA64FxNOgA5tksruNvBSyzkE";
        String accessToken = "1511094511514042371-sE4PFrhtCkBRNZjO2NNve8nlRcEqsN";
        String tokenSecret =  "ZegvEd3cpx6o2DZq3YuSGJwxuO1WwIWWUE34u35HwFxA5";

        HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken, tokenSecret);
        CrdDao dao = new TwitterDao(httpHelper);
        Service service = new TwitterService(dao);
        Controller controller = new TwitterController(service);
        TwitterCLIApp app = new TwitterCLIApp(controller);

        app.run(args);
    }


    public void run(String[] args){
        if(args.length==0){
            throw new IllegalArgumentException(USAGE);
        }
        switch(args[0].toLowerCase()){
            case "post":
                printTweet(controller.postTweet(args));
                break;
            case "show":
                printTweet(controller.showTweet(args));
                break;
            case "delete":
                List<Tweet> deletedTweets = controller.deleteTweet(args);
                for(Tweet tweet: deletedTweets){
                    printTweet(tweet);
                }
                break;
            default:
                throw new IllegalArgumentException(USAGE);
            }
        }

    private void printTweet(Tweet tweet){
        try{
            System.out.println(JsonParser.toJson(tweet, true, false));
        }catch(JsonProcessingException e){
            throw new RuntimeException("Unable to conver tweet object to string",e);
        }
    }
    
}
