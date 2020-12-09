package com.sdd.demo;

import java.util.ArrayList;

public class System {
    public static System system_instance = null;

    public System() {
        if (system_instance == null) {
            system_instance = new System();
        }
    }
    private UserSystem userSystem;
    private ReviewSystem reviewSystem;

    boolean addUser( User user ) {
        return userSystem.addUser( user );
    }
    User getUserByUsername( String username ) {
        return userSystem.getUserByUsername( username );
    }
    boolean addReview( Review review ) {
        return reviewSystem.addReview( review );
    }
    boolean removeReview( String id ) {
        return reviewSystem.removeReview( id );
    }
    ArrayList<Review> getReviews( String keyword ) {
        return reviewSystem.getReviews( keyword );
    }
    int getStrikes( User user ) {
        return userSystem.getStrikes( user );
    } 
    boolean authenticateUser( String username, String password ) {
        return userSystem.authenticateUser( username, password );
    }
}
