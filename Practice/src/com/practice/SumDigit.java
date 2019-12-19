package com.practice;

public class SumDigit {

	public static void main(String[] args) {

		System.out.println(sumDigit(32123));
	}
	
	private static int sumDigit(int n) {
		if(n<10)
			return -1;
		int sum = 0;
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

}
