package com.ag;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {
	
	private int id;
	private String qname;
	private Map<Answer, User> answers;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getQname() {
		return qname;
	}



	public void setQname(String qname) {
		this.qname = qname;
	}



	public Map<Answer, User> getAnswers() {
		return answers;
	}



	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}



	public void displayInfo() {
		System.out.println("Question ID: " + id);
		System.out.println("Question name: " + qname);
		System.out.println("Answers: ");
		Set<Entry<Answer, User>> set = answers.entrySet();
		Iterator<Entry<Answer, User>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Answer, User> entry = iterator.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information: ");
			System.out.println(ans);
			System.out.println("Posted By: ");
			System.out.println(user);
//			System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
			
		}
	}
}
