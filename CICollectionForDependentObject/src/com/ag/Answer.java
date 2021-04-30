package com.ag;

public class Answer {
	
	private int id;
	private String description;
	
	public Answer(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", description=" + description + "]";
	}
	
	

}
