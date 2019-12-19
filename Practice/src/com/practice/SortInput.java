package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortInput {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("How many elements");
		int count = scanner.nextInt();
		int[] integerArray = getInputArray(count);
		printArray(integerArray);
		reverseArray(integerArray);
		//int minValue = getMinValue(integerArray);
		//integerArray = sortArray(integerArray);
		
		//System.out.println("Min value is "+minValue);
		
		//printArray(integerArray);
		
	}

	private static void reverseArray(int[] integerArray) {
		System.out.println("Reverse array");
		int temp;
		int length = integerArray.length-1;
		for(int i=0; i<(integerArray.length/2); i++) {
			temp = integerArray[i];
			integerArray[i] = integerArray[length-i];
			integerArray[length-i] = temp;
		}
		
			
			System.out.println(Arrays.toString(integerArray));
	}

	private static int getMinValue(int[] integerArray) {
		int min = integerArray[0];
		for(int i=0; i<integerArray.length; i++) {
			if(integerArray[i]<=min)
				min = integerArray[i];
		}
		return min;
	}

	private static int[] sortArray(int[] integerArray) {

		for(int i=0; i<integerArray.length; i++) {
			for(int j=i+1; j<integerArray.length; j++) {
				if(integerArray[j]>integerArray[i]) {
					int temp = integerArray[j];
					integerArray[j] = integerArray[i];
					integerArray[i] = temp;
				}
			}
		}
		return integerArray;
	}

	private static void printArray(int[] integerArray) {
		System.out.println("Elements are");
		for(int i=0; i<integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
	}

	private static int[] getInputArray(int length) {
		System.out.println("Enter "+length +" integers");
		int[] inputArray = new int[length];
		for(int i=0; i<length; i++) {
			inputArray[i] = scanner.nextInt();
		}
		return inputArray;
	}

}
