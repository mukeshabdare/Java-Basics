package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MapCount {
	
	public static void main(String args[]) {
		
		String s = "ABDCABB";
		int a = 010;
		int b = 070;
		
		System.out.println(a + " " + b);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i<s.length(); i++){
			
				if(!map.containsKey(s.charAt(i)))
					map.put(s.charAt(i),1);
				else
					map.put(s.charAt(i),map.get(s.charAt(i))+1);

		}
		
		System.out.println(map.toString());
		
	}
	
}
