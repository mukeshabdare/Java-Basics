package com.practice;

public class Anangram {

	public static void main(String[] args) {

		System.out.println(isAnagram("erbdeg","edbgre"));
		//System.out.println(new String("hello") == new String("hello"));
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
//		char [] s1 = string.toCharArray();
//		char [] s2 =string2.toCharArray();
//		Arrays.parallelSort(s1);
//		Arrays.parallelSort(s2);
		
			if(s1.length() != s2.length()) {
				return false;
			}
			
			for(int i=0; i<s1.length(); i++) {
				if(s1.indexOf(s2.charAt(i))<0) {
					return false;
				}
			}
		return true;
	}
	
}
