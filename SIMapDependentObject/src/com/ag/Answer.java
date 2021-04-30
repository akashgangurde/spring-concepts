package com.ag;

import java.util.Date;

public class Answer {
	
	private int id;
	private String answer;
	private Date posteddate;
	
	public Answer() {
		super();
	}
	
	public Answer(int id, String answer, Date posteddate) {
		super();
		this.id = id;
		this.answer = answer;
		this.posteddate = posteddate;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", posteddate=" + posteddate + "]";
	}
	
	

}
