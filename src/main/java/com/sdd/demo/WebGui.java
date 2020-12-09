package com.sdd.demo;

public class WebGui {
    public static WebGui web_gui_instance = null;

    public WebGui() {
        if (web_gui_instance == null) {
            web_gui_instance = new WebGui();
        }
    }
    void displayReviews( Landlord landlord ) {
        java.lang.System.out.println( landlord.getReviews() );
    }
    void displayProfile( User user ) {
        java.lang.System.out.println( user );
    }
    void addAccount( String username, String first_name, 
                     String last_name, String email, 
                     String password ) {
        Controller.handleEvent( StringMasher.mash("addAccount", username, first_name, last_name, email, password) );
    }
    boolean login( String username, String password ) {
        try {
            Controller.handleEvent(StringMasher.mash("login", username, password));
            return true;
        } catch (Exception e) {
            java.lang.System.out.println( e.getMessage() );
            return false;
        }
    }
    void viewStrikes( Renter renter ) {
        java.lang.System.out.print( renter.getStrikes() );
    }
    boolean addReview( String title, String body, int num_stars) {
        try {
            Controller.handleEvent( StringMasher.mash("addReview", title, body, num_stars) );
            return true;
        } catch (Exception e) {
            java.lang.System.out.println( e.getMessage() );
            return false;
        }

    }
    void removeReview( String id ) {
        Controller.handleEvent( StringMasher.mash( "removeReview", id ) );
    }
}

class StringMasher {
    public static String mash(Object... objs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : objs) {
            stringBuilder.append(o);
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }
}
