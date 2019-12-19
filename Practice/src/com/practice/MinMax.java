package com.practice;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number");
			if(sc.hasNextInt()) {
				int currentInt = sc.nextInt();
				if(currentInt < min) {
					min  = currentInt;
				}
				if(currentInt > max) {
					max = currentInt;
				}
			} else {
				System.out.println("Invalid Number entered");
				System.out.println("Min:"+min+" Max:"+max);
				sc.nextLine();
				sc.close();
				break;
			}
		}
	}
}
