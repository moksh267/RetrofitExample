package com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hero {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("realname")
    @Expose
    private String realname;
    @SerializedName("team")
    @Expose
    private String team;
    @SerializedName("firstappearance")
    @Expose
    private String firstappearance;
    @SerializedName("createdby")
    @Expose
    private String createdby;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("imageurl")
    @Expose
    private String imageurl;
    @SerializedName("bio")
    @Expose
    private String bio;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", realname='" + realname + '\'' +
                ", team='" + team + '\'' +
                ", firstappearance='" + firstappearance + '\'' +
                ", createdby='" + createdby + '\'' +
                ", publisher='" + publisher + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}