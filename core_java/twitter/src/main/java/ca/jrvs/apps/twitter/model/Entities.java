package ca.jrvs.apps.twitter.model;

import java.util.Objects;

public class Entities {
    
    private Hashtag hashtag;
    private UserMention userMention;


    public Entities() {
    }

    public Entities(Hashtag hashtag, UserMention userMention) {
        this.hashtag = hashtag;
        this.userMention = userMention;
    }

    public Hashtag getHashtag() {
        return this.hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    public UserMention getUserMention() {
        return this.userMention;
    }

    public void setUserMention(UserMention userMention) {
        this.userMention = userMention;
    }

    public Entities hashtag(Hashtag hashtag) {
        setHashtag(hashtag);
        return this;
    }

    public Entities userMention(UserMention userMention) {
        setUserMention(userMention);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Entities)) {
            return false;
        }
        Entities entities = (Entities) o;
        return Objects.equals(hashtag, entities.hashtag) && Objects.equals(userMention, entities.userMention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashtag, userMention);
    }

    @Override
    public String toString() {
        return "{" +
            " hashtag='" + getHashtag() + "'" +
            ", userMention='" + getUserMention() + "'" +
            "}";
    }


}
