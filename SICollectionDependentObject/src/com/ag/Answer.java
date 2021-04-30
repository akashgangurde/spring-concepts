package com.ag;

public class Answer {
	
	private int id;
	private String description;
	private String postedBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", description=" + description + ", postedBy=" + postedBy + "]";
	}
	
	

}
