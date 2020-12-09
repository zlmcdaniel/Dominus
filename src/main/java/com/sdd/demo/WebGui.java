public class WebGui {
    public static WebGui web_gui_instance = null;

    public WebGui() {
        if (web_gui_instance == null) {
            web_gui_instance = new WebGui();
        }
    }
    void displayReviews( Landlord landlord ) {
        System.out.println( landlord.getReviews() );
    }
    void displayProfile( User user ) {
        System.out.println( user );
    }
    void addAccount( String username, String first_name, 
                     String last_name, String email, 
                     String password ) {
        Controller.handleEvent( "addAccount", username, first_name, last_name, email, password );
    }
    boolean login( String username, String password ) {
        Controller.handleEvent( "login", username, password );
    }
    void viewStrikes( Renter renter ) {
        System.out.print( renter.getStrikes() );
    }
    boolean addReview( String title, String body, int num_stars) {
        Controller.handleEvent( "addReview", title, body, num_stars );
    }
    void removeReview( String id ) {
        Controller.removeReview( "removeReview", id );
    }
}
