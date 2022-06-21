package ca.jrvs.apps.twitter.model;

import java.util.Objects;

public class Coordinates {
    
    private Float [] coordinates; 

    private String type;



    public Coordinates() {
    }

    public Coordinates(Float[] coordinates, String type) {
        this.coordinates = coordinates;
        this.type = type;
    }

    public Float[] getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(Float[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Coordinates coordinates(Float[] coordinates) {
        setCoordinates(coordinates);
        return this;
    }

    public Coordinates type(String type) {
        setType(type);
        return this;
    }



    @Override
    public int hashCode() {
        return Objects.hash(coordinates, type);
    }

    @Override
    public String toString() {
        return "{" +
            " coordinates='" + getCoordinates() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }





    
}
