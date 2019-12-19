package com.practice;

public class Positive {

	public static void main(String[] args) {

		int number = 0;
		checkNumber(number);
		
	}
	
	public static void checkNumber(int number) {
		String result = "Zero";
		if(number < 0) {
			result = "Negative";
		} else if(number > 0) {
			result = "Positive";
		} 
		
		System.out.println("Entered number is a "+ result);
	}

}
