package com.sdd.demo;
import java.util.ArrayList;

public class UserSystem {
    
    private ArrayList<User> users;

    private User cached_user;

    public UserSystem() {
        super();

        users = new ArrayList<User>();
        cached_user = null;
    }

    // Add a user to the System
    public boolean addUser( User user ) {
        return users.add( user );
    }

    // Get the currently cached user
    public User cachedUser() {
        return cached_user;
    }

    // Get a User by the username
    public User getUserByUsername( String username ) {
        for( User user : users ) {
            if( user.getUsername().equals( username ) ) {
                return user;
            }
        }

        return null;
    }

    // Get the strikes for the user
    public int getStrikes( User user ) {
        if ( user instanceof Renter ) {
            Renter r = (Renter) user;
            return r.getStrikes();
        }
        return -1;
    }

    // Check if the user is authenticated
    public boolean authenticateUser( String username, String password ) {
        User check = getUserByUsername( username );
        if( check != null && check.checkPassword( password ) ) {
            cached_user = check;
            return true;
        }

        return false;
    }
}
