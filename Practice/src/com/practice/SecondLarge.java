package com.practice;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint first, second

		int [] a = {22,312,43,42,5,78,567,5575,10};	
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println("Second large: "+a[a.length-2]);
		int first, second;
		first = second = Integer.MIN_VALUE;
		System.out.println(first);
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > first) {
				
				second = first;
				first = a[i];
			} if(a[i] < first && a[i] > second) {
				second = a[i];
			}
		}
		
		System.out.println("Second largest no: "+second);
	}

}
