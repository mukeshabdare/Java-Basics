package com.practice;

public class BankString {

	public BankString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12340;
		System.out.println(getToString(number));

	}

	
	private static String getToString(int number) {
		int dec = 0, temp =number;
		
		while(temp > 0) {
			temp/=10;
			dec++;
		}
		return null;
	}

}
