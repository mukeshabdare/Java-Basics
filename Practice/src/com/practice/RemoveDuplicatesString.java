/**
 * 
 */
package com.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author abdare
 *
 */
public class RemoveDuplicatesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s  = "aaiidsfiwraff";
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			if(set.add(s.charAt(i)))
				sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		
	}

}
