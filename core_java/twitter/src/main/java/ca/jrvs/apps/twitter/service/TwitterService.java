package ca.jrvs.apps.twitter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import ca.jrvs.apps.twitter.dao.CrdDao;
import ca.jrvs.apps.twitter.model.Tweet;

public class TwitterService implements Service {
    
    
    private CrdDao dao;

    private static String LONG_MAX = Long.toString(Long.MAX_VALUE);

    public TwitterService(CrdDao dao){
        this.dao=dao;
    }

    @Override
    public Tweet postTweet(Tweet tweet) {
        // TODO Auto-generated method stub
    
        validatePostTweet(tweet);

        return (Tweet) dao.create(tweet);
    }

    private void validatePostTweet(Tweet tweet) {
        if(tweet.getText().length()>141){
            throw new IllegalArgumentException("Tweet must be 140 or less");
        }
    }

    @Override
    public Tweet showTweet(String id, String[] fields) {
        // TODO Auto-generated method stub
        validateID(id);
        
        return (Tweet) dao.findById(id);
    }

    private void validateID(String id) {
        if(id.length()>LONG_MAX.length()){
            throw new IllegalArgumentException("ID is out of range!");
        }

    }
        

    @Override
    public List<Tweet> deleteTweets(String[] ids) {
                
        return validateDeleteIds(ids);
    }

    private List<Tweet> validateDeleteIds(String[] ids) {
        
        List<Tweet> deletedTweets = new ArrayList<>();

        for(String id: ids){
            if(id.length()>LONG_MAX.length()){
                throw new IllegalArgumentException("ID is out of range: "+id +"Please double check ID again");
            }else{
                deletedTweets.add((Tweet) this.dao.findById(id));
                this.dao.deleteById(id);
            }
        }

        return deletedTweets;
    }


}
