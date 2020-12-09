package com.sdd.demo;

import java.util.ArrayList;

class Renter extends User {

    private int strikes;
    private ArrayList<Review> reviews;

    public Renter( String username, String first_name, String last_name, String email, String password ) {
        super(username, first_name, last_name, email, password);
        reviews = new ArrayList<Review>();
    }

    public int getStrikes() {
        return strikes;
    }

    public void incrementStrikes() {
        if(strikes < 3) {
            strikes++;
        }
    }

    public void decrementStrikes() {
        if(strikes > 0) {
            strikes--;
        }    
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public boolean addReview(Review review) {
        reviews.add(review);
        return true;
    }

    public boolean deleteReview(Review review) {
        for(int i = 0; i < reviews.size(); i++) {
            if(reviews.get(i).getId() == review.getId()) {
                reviews.remove(i);
                return true;
            }
        }
        return false;
    }

}