package com.practice;

public class StringRev {

	public StringRev() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString("abcdef");

	}

	private static void reverseString(String string) {
		// TODO Auto-generated method stub
		if(string == null || string.length()  <= 1) {
			System.out.println(string);
			return;
		}
		System.out.print(string.charAt(string.length()-1));
		reverseString(string.substring(0, string.length()-1));
	}

}
