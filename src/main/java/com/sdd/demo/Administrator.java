package com.sdd.demo;

class Administrator extends User {
    
    public Administrator( String username, String first_name, String last_name, String email, String password, String secret_question, String secret_answer ) {
        super(username, first_name, last_name, email, password, secret_question, secret_answer);
    }

}