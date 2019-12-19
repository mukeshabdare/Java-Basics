package com.practice;

public class VipCustomer {
	
	private String name;
	private String email;
	private double creditLimit;

	public VipCustomer() {
		this("Ramesh","ram@ntflix.com", 10000d);
	}
	
	

	/**
	 * @param name
	 * @param email
	 */
	public VipCustomer(String name, String email) {
		this(name,email,25000d);
	}



	/**
	 * @param name
	 * @param email
	 * @param creditLimit
	 */
	public VipCustomer(String name, String email, double creditLimit) {
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}
	
	

}
