package com.practice;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Mukesh");
		String s2 = "Mukesh";
		String s3 = s2.intern();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3==s2);
	}

}
