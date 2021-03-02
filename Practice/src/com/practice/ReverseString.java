/**
 * 
 */
package com.practice;

/**
 * @author abdare
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdef";
		int length = s.length();
		
		char [] rev = new char [length+1];
		
		for(int i=0 ; i<length; i++) {
			rev[i] = s.charAt(length-1-i);
		}
		
		System.out.println(new String(rev));

	}

}
