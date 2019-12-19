package com.practice;

public class FeetConverter {

	public static void main(String[] args) {

		toCentiMeters(12);
		toCentiMeters(0, 6);
	}
	
	public static void toCentiMeters(double feet, double inches) {
		if((inches < 0 || inches >12) || feet <0) {
			System.out.println("Invalid parameters");
		} else {
			double centimeters = inches + feet * 12;
			System.out.println(feet+" Feet "+inches + " Inches" + " = " + centimeters*2.54 +" Centimeters");
		}
	}
	
	public static void toCentiMeters(double inches) {
		if(inches < 0) {
			System.out.println("Invalid parameter");
		} else {
			int feet = (int)inches/12;
			int remainingInches = (int) (inches %12);
			toCentiMeters(feet,remainingInches);
			//System.out.println(inches + "Inches" + " = " + inches*2.54 +" Centimeters");
		}
	}	
}
