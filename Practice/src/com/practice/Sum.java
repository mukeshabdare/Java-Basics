package com.practice;

public class Sum {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("Number :" +i);
				sum+=i;
				count+=1;
				if(count==5)
					break;
			}
		}
		
		System.out.println("Count: "+count+" Sum: "+sum);
	}

}
