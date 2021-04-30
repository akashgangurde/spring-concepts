package com.ag;

import java.util.Map;

public class Question {
	
	private int id;
	private String qName;
	private Map<Answer, User> answer;
	
	public Question(int id, String qName, Map<Answer, User> answer) {
		super();
		this.id = id;
		this.qName = qName;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qName=" + qName + ", answer=" + answer + "]";
	}
	
	
	

}
