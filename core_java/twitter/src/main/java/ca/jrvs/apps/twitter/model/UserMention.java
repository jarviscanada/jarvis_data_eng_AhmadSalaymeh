package ca.jrvs.apps.twitter.model;

import java.util.Objects;

public class UserMention {

    private int id;
    private String id_str;
    private int[] indices;
    private String name;
    private String screen_name;


    public UserMention() {
    }

    public UserMention(int id, String id_str, int[] indices, String name, String screen_name) {
        this.id = id;
        this.id_str = id_str;
        this.indices = indices;
        this.name = name;
        this.screen_name = screen_name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_str() {
        return this.id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public int[] getIndices() {
        return this.indices;
    }

    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen_name() {
        return this.screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public UserMention id(int id) {
        setId(id);
        return this;
    }

    public UserMention id_str(String id_str) {
        setId_str(id_str);
        return this;
    }

    public UserMention indices(int[] indices) {
        setIndices(indices);
        return this;
    }

    public UserMention name(String name) {
        setName(name);
        return this;
    }

    public UserMention screen_name(String screen_name) {
        setScreen_name(screen_name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserMention)) {
            return false;
        }
        UserMention userMention = (UserMention) o;
        return id == userMention.id && Objects.equals(id_str, userMention.id_str) && Objects.equals(indices, userMention.indices) && Objects.equals(name, userMention.name) && Objects.equals(screen_name, userMention.screen_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_str, indices, name, screen_name);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_str='" + getId_str() + "'" +
            ", indices='" + getIndices() + "'" +
            ", name='" + getName() + "'" +
            ", screen_name='" + getScreen_name() + "'" +
            "}";
    }

    
    
}
