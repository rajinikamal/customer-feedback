package model;

public class Review {
	private String name;
	private String email;
	private String message;
	private String feedbacktype;
	private String ratings;
	
	
	public Review(String name, String email, String message, String feedbacktype, String ratings) {
		
		this.name = name;
		this.email = email;
		this.message = message;
		this.feedbacktype = feedbacktype;
		this.ratings = ratings;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFeedbacktype() {
		return feedbacktype;
	}
	public void setFeedbacktype(String feedbacktype) {
		this.feedbacktype = feedbacktype;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	
	
	

}
