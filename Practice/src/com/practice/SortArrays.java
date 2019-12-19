package com.practice;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOne = {5,3,2,8};
		int[] arrayTwo = {1,4,5,6};
		int length = arrayOne.length+arrayTwo.length;
		int[] sortedArray = new int [length];
		
//		for(int i=0; i<length; i++) {
//			
//		}
		int i=0;
		while(i<arrayOne.length) {
			sortedArray[i] = arrayOne[i];
			i++;
		}
		
		int j=0;
		while(j<arrayTwo.length) {
			sortedArray[i] = arrayTwo[j];
			i++;
			j++;
		}
		
		Arrays.sort(sortedArray);

		for(int k=0; k<length; k++) {
			System.out.println(sortedArray[k]);
		}
	}

}
