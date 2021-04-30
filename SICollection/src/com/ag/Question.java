package com.ag;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String qName;
	private List<String> answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	
	void display() {
		System.out.println(id + " " + qName);
		Iterator<String> iterator = answer.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	

}
