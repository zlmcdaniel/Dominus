package com.sdd.demo;

import java.util.ArrayList;

public class ReviewSystem {
    boolean addReview( Review review ) {
        return database.addReview( review );
    }
    boolean removeReview( String id ) {
        return database.removeReview( id );
    }
    ArrayList<Review> getReviews( String keyword ) {
        return database.getReviews( keyword );
    }
}
