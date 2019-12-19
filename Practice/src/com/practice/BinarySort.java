package com.practice;

public class BinarySort {

	public static void main(String[] args) {

		  int arr[] = {10,20,30,40,50};  
	        int key = 50;  
	        int last=arr.length-1;
	        
	        binarySearch(arr,0,last,key); 
	}

	private static void binarySearch(int[] arr, int first, int last, int key) {

		int mid = (first+last)/2;
		
		while(first<=last) {
			
			if(key > arr[mid]) {
				first = mid+1;
			}else if(key == arr[mid]) {
				System.out.println(key+" found at " +mid);
				return;
			} else if(key<arr[mid]){
				last = mid-1;
			}
			
			mid = (first+last)/2;
		}
			if(first > last) {
				System.out.println(key+" not found");
			}
		
		
		
	}

}
