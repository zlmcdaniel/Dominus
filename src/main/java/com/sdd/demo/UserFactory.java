package com.sdd.demo;

public class UserFactory {

    // Object Creation
    private UserFactory(){}

    public static User getUser( String user_type, String username, String first_name, String last_name, String email, String password,
                                String secret_question, String secret_answer ) throws IllegalArgumentException {
        switch (user_type) {
            case "Landlord":
                return new Landlord( first_name, last_name );
            case "Renter":
                return new Renter( username, first_name, last_name, email, password, secret_question, secret_answer );
            case "Administrator":
                return new Administrator( username, first_name, last_name, email, password, secret_question, secret_answer );
            default:
                throw new IllegalArgumentException("User type not recognized");
        }
    }
}
