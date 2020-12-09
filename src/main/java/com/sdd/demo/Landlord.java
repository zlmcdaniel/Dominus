// Java library import(s)
package com.sdd.demo;

import java.util.ArrayList;
import java.util.List;

public class Landlord extends User {
	
	// Representation
	private ArrayList<Review> reviews;
	// Remaining representation inherited from User

	// Constructor(s)
	public Landlord( String first_name_, String last_name_ ) {
		// Set up user
		super( null, first_name_, last_name_, null, null, null, null );

		// Create empty list for reviews
		reviews = new ArrayList<Review>();
	}

	// Accessor(s)
	public ArrayList<Review> getReviews() {
		return reviews;
	}

	// Modifiers(s)
	public boolean addReview( Review review ) {
		return reviews.add( review );
	}

	public boolean removeReview( String id ) {
		for ( int i = 0; i < reviews.size(); i++ ) {
			if ( reviews.get(i).getID().equals(id) ) {
				// Remove review if found in list, return true when removed
				reviews.remove( i );
				return true;
			}
		}
		// Return review if review is removed
		return false;
	}

}