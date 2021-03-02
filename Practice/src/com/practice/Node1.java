package com.practice;

public class Node1 {
	
	private Node1 next;
	private String value;
	
	
	public Node1(String value) {
		super();
		this.value = value;
	}
	
	public Node1 getNext() {
		return next;
	}
	public void setNext(Node1 next) {
		this.next = next;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
