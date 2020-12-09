import java.util.ArrayList;

public class ReviewSystem {
    
    private ArrayList<Review> reviews;

    public ReviewSystem() {
        super();

        reviews = new ArrayList<Review>();
    }

    // Add a Review to the System
    public boolean addReview( Review review ) {
        return reviews.add( review );
    }

    // Remove a Review to the System
    public boolean removeReview( String id ) {
        for( Review review : reviews )
        {
            if( review.getId().equals( id ) ) {
                return reviews.remove( review );
            }
        }

        return false;
    }

    // Get all Reviews that apply to the given keyword
    public ArrayList<Review> getReviews( String keyword ) {
        ArrayList<Review> results = new ArrayList<Review>();

        for( Review review : reviews )
        {
            if( review.getTitle().indexOf( keyword ) != -1 ) {
                results.add( review );
                continue;
            }

            else if( review.getComment().indexOf( keyword ) != -1 ) {
                results.add( review );
                continue;
            }

            else if( review.getReviewer().getFirstName().indexOf( keyword ) != -1 || review.getReviewer().getLastName().indexOf( keyword ) != -1) {
                results.add( review );
                continue;
            }

            else if( review.getLandlord().getFirst_name().indexOf( keyword ) != -1 || review.getLandlord().getLast_name().indexOf( keyword ) != -1) {
                results.add( review );
                continue;
            }
        }

        return results;
    }

}
