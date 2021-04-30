package com.ag;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String qName;
	private Map<String, String> answers;
	
	public Question(int id, String qName, Map<String, String> answers) {
		super();
		this.id = id;
		this.qName = qName;
		this.answers = answers;
	}
	
	
	public void display() {
		System.out.println("Question ID: " +id);
		System.out.println("Question name: " + qName);
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println("Answer: " + entry.getKey() + " User : " + entry.getValue());
			
		}
		

	}
	

}
