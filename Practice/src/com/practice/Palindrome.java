package com.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcba";
		System.out.println(isPalindrome(str));
		
		
			
		}
	private static boolean isPalindrome(String str) {
		if(str==null) {
			return false;
		}
		int length = str.length();
		System.out.print(length);
		for (int i = 0; i < length/2; i++) {
			if(str.charAt(i)!=str.charAt(length-i-1))
			return false;
		}
			return true;
}
}