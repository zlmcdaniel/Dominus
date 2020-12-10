// Java library import(s)
package com.sdd.demo;

public abstract class User {

    // Representation
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String secret_question;
    private String secret_answer;

    // Remaining representation inherited from User

    // Constructor(s)
    public User( String username, String first_name, String last_name, String email, String password, String secret_question, String secret_answer ) {
        // Set username, firstname, lastname, email, password
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.secret_question = secret_question;
        this.secret_answer = secret_answer;

    }

    // Accessor(s)
    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getSecretQuestion() {
        return secret_question;
    }

    // Modifiers(s)
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param new_password New password to be added to account
     * @param secret_answer Answer to the user's secret question
     * @throws IllegalArgumentException - If the secret answer is incorrect
     */
    public void setPassword(String new_password, String secret_answer ) throws IllegalArgumentException {
        if( this.secret_answer.equals(secret_answer) ) {
            this.password = new_password;
        } else {
            throw new IllegalArgumentException("Incorrect Secret Answer");
        }

    }

    public boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    /* Spring Methods */

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getSecret_question() {
        return secret_question;
    }

    public void setSecret_question(String secret_question) {
        this.secret_question = secret_question;
    }

    private String getSecret_answer() {
        return secret_answer;
    }

    public void setSecret_answer(String secret_answer) {
        this.secret_answer = secret_answer;
    }
}