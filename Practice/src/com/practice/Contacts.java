package com.practice;

public class Contacts {

	private String name;
	private long mobileNumber;
	/**
	 * @param name
	 * @param mobileNumber
	 */
	public Contacts(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
