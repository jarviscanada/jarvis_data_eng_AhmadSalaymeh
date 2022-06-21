package ca.jrvs.apps.twitter.model;

import java.util.Objects;

public class Hashtag {
    
    private int[] indices;
    private String text;



    public Hashtag() {
    }

    public Hashtag(int[] indices, String text) {
        this.indices = indices;
        this.text = text;
    }

    public int[] getIndices() {
        return this.indices;
    }

    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Hashtag indices(int[] indices) {
        setIndices(indices);
        return this;
    }

    public Hashtag text(String text) {
        setText(text);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hashtag)) {
            return false;
        }
        Hashtag hashtag = (Hashtag) o;
        return Objects.equals(indices, hashtag.indices) && Objects.equals(text, hashtag.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indices, text);
    }

    @Override
    public String toString() {
        return "{" +
            " indices='" + getIndices() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }


}
