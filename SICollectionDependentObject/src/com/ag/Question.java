package com.ag;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String qname;
	private List<Answer> answer;
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
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	void display() {
		System.out.println(id + " " + qname);
		Iterator<Answer> iterator = answer.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
