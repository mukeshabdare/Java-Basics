package com.practice;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		int [] b = {4,5,6,7,8};
		
		int [] c = new int [a.length+b.length];
		int count = 0;
		
//		for(int i=0; i<a.length; i++) {
//			c[count++] = a[i];
//		}
//		
//		for(int i=0; i<b.length; i++) {
//			c[count++] = b[i];
//		}
		
		for(int i=0 ; i<c.length; i++) {
			
			if(a.length == b.length) {
				c[i] = a[i];
				c[a.length+i] = b[i]; 
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}