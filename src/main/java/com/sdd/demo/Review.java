// Java library import(s)
package com.sdd.demo;
import java.util.ArrayList;
import java.util.List;

public class Review {

	// Static integer variable and constant for generating ID's
	private static int nextID = 1;
	private static final int IDLENGTH = 5;

	// Representation
	private String id, title, comments;
	private int num_stars;
	private Renter reviewer;
	private Landlord landlord;
	private boolean is_verified;
	private ArrayList<String> images;

	// Constructor(s)
	public Review( String title_, int num_stars_, String comments_,
				   Renter reviewer_, Landlord landlord_ ) {
		this( title_, num_stars_, comments_, reviewer_, landlord_,
			  false, ArrayList() );
	}
	public Review( String title_, int num_stars_, String comments_,
				   Renter reviewer_, Landlord landlord_, 
				   boolean is_verified_, ArrayList<String> images_ ) {
		// Set title, num_stars, comments, reviewer, landlord, is_verified,
		// and images
		title = title_;
		num_stars = num_stars_;
		comments = comments_;
		reviewer = reviewer_;
		landlord = landlord_;
		is_verified = is_verified_;
		images = images_;
		
		// Create and set id, then increment nextID for next use
		String nextIDString = nextID;
		String leading0s = "";
		for ( int i = 0; i < IDLENGTH - nextIDString.length(); i++ ) {
			leading0s += "0";
		}
		id = "R" + leading0s + nextIDString;
		nextID++;
	}

	// Accessor(s)
	public String getID() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getNumStars() {
		return num_stars;
	}
	public String getComments() {
		return comments;
	}
	public Renter getReviewer() {
		return reviewer;
	}
	public Landlord getLandlord() {
		return landlord;
	}
	public boolean getIsVerified() {
		return is_verified;
	}

	// Modifier(s)
	public boolean setIsVerified( boolean is_verified_ ) {
		is_verified = is_verified_;

		return is_verified == is_verified_;
	}

}