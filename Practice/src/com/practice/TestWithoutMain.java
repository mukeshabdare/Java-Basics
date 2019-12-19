package com.practice;

public class TestWithoutMain {

	public static void main(String[] args) {
		
		//throw new RuntimeException("");	
		int i=100;
		int j=200;
		
		swap(i,j);
		System.out.println(i+" "+j);
		
		String s = "string";
		Object o = s;
		
		Object o1 = "object";
	}
	
	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = i;
	}
}
