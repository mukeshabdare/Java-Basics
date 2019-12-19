package com.practice;

public class BankAccount {

	private String customerName;
	private long accountNumber;
	private long mobileNumber;
	private String email;
	private double accountBalance;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amount) {
		if(amount <= this.accountBalance) {
			this.accountBalance-=amount;
		} else {
			System.out.println("Insufficient amount in you account");
		}
	}
	
	public void deposit(double amount) {
		this.accountBalance+=amount;
	}
	
}
