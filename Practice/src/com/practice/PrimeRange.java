package com.practice;

public class PrimeRange {

	public static void main(String[] args) {

		int count = 0;
		for(int i=12; i<120; i++) {
			if(isPrime(i)) {
				count++;
				if(count==3) 
					break;
				}
			}
		
			
	}
	
	private static boolean isPrime(int i) {
		if(i==1) {
			return false;
		}
		for(int j=2; j<=i/2; j++) {
			
			if(i%j == 0) {
			return false;
			}
		}
		
		System.out.println("Prime number "+i);
		return true;
	}

}
