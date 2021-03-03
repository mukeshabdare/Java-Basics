package com.string;

public class StringFinder {

	public static void main(String[] args) {

		
		String s = "aSONYal";
		System.out.println(s.matches(".SONY.."));
		//String s = "aaSONYafgds";
		int index = s.indexOf("SONY");
		if(index + 5 == s.length()-1 && index > 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(s.indexOf("SONY"));
	}

}
