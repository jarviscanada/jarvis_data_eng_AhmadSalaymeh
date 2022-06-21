package ca.jrvs.apps.twitter.model;

import java.util.Objects;

public class Tweet {
    
    private String created_at;
    private int id;
    private String id_string;
    private String text;
    private Entities entities;
    private Coordinates coordinates;



    public Tweet() {
    }

    public Tweet(String text) {
        this.text = text;

    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_string() {
        return this.id_string;
    }

    public void setId_string(String id_string) {
        this.id_string = id_string;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Entities getEntities() {
        return this.entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Tweet created_at(String created_at) {
        setCreated_at(created_at);
        return this;
    }

    public Tweet id(int id) {
        setId(id);
        return this;
    }

    public Tweet id_string(String id_string) {
        setId_string(id_string);
        return this;
    }

    public Tweet text(String text) {
        setText(text);
        return this;
    }

    public Tweet entities(Entities entities) {
        setEntities(entities);
        return this;
    }

    public Tweet coordinates(Coordinates coordinates) {
        setCoordinates(coordinates);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tweet)) {
            return false;
        }
        Tweet tweet = (Tweet) o;
        return Objects.equals(created_at, tweet.created_at) && id == tweet.id && Objects.equals(id_string, tweet.id_string) && Objects.equals(text, tweet.text) && Objects.equals(entities, tweet.entities) && Objects.equals(coordinates, tweet.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created_at, id, id_string, text, entities, coordinates);
    }

    @Override
    public String toString() {
        return "{" +
            " created_at='" + getCreated_at() + "'" +
            ", id='" + getId() + "'" +
            ", id_string='" + getId_string() + "'" +
            ", text='" + getText() + "'" +
            ", entities='" + getEntities() + "'" +
            ", coordinates='" + getCoordinates() + "'" +
            "}";
    }




}
