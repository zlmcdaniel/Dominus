package com.sdd.demo;

public class UserSystem {
    boolean addUser( User user ) {
        return database.add( user );
    }
    User getUserByUsername( String username ) {
        return database.get( username );
    }
    int getStrikes( User user ) {
        return database.get( user ).strikes;
    } 
    boolean authenticateUser( String username, String password ) {
        return database.authenticate( username, password );
    }
}
