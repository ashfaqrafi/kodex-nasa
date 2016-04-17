package com.app.sanzidashan.aurik;

/**
 * Created by anwar on 4/7/2016.
 */
public class Post {
    private String postAddress;
    private String postImage;
    private int likeCount;

    Post(String postAddress, String postImage, int likeCount){
        this.postAddress = postAddress;
        this.postImage = postImage;
        this.likeCount = likeCount;

    }

    Post(String postAddress, int likeCount){
        this.postAddress = postAddress;
        this.postImage = "";
        this.likeCount = likeCount;
    }



    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }


}
