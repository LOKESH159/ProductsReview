package com.example.ProductReview.model;

public class Review {

    private String feedBack;

    private String rating;

    public Review(String feedBack, String rating) {
        this.feedBack = feedBack;
        this.rating = rating;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public String getRating() {
        return rating;
    }
}
