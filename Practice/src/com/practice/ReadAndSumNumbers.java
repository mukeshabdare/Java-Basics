package com.practice;

import java.util.Scanner;

public class ReadAndSumNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numbersRead = 1;
		int sum = 0;
		
		while(numbersRead <= 10) {
			System.out.println("Enter number "+ numbersRead);
			if(sc.hasNextInt()) {
				sum+=sc.nextInt();
				numbersRead++;
			} else {
				System.out.println("Invalid number!");
			}
			sc.nextLine();
		}
		
		System.out.println("Sum of all numbers: "+sum);
	}

}
