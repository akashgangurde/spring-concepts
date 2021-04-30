package com.ag;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String qName;
	private List<String> answers;
	
	public Question(int id, String qName, List<String> answers) {
		super();
		this.id = id;
		this.qName = qName;
		this.answers = answers;
	}
	
	public void display() {
		System.out.println(id + " " + qName);
		System.out.println("Answers are: ");
		Iterator<String> iterator = answers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
