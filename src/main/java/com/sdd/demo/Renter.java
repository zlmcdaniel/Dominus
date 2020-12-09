package com.sdd.demo;

import java.util.ArrayList;

class Renter extends User {

    private int strikes;
    private ArrayList<Review> reviews;

    public Renter( String username, String first_name, String last_name, String email, String password, String secret_question, String secret_answer ) {
        super(username, first_name, last_name, email, password, secret_question, secret_answer);
        reviews = new ArrayList<Review>();
    }




    // Accessor(s)
    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public int getStrikes() {
        return strikes;
    }


    // Modifier(s)
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

    public boolean addReview(Review review) {
        reviews.add(review);
        return true;
    }

    public boolean deleteReview(Review review) {
        for(int i = 0; i < reviews.size(); i++) {
            if(reviews.get(i).getID() == review.getID()) {
                reviews.remove(i);
                return true;
            }
        }
        return false;
    }

}