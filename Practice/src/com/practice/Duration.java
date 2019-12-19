package com.practice;

public class Duration {

	public static void main(String args []) {
		System.out.println(getDuration(80,6));
		System.out.println(getDuration(3945));
	}
	
	public static String getDuration(int minutes, int seconds) {
		
		if((minutes>=0) && (seconds>=0 && seconds<=59)) {
			int hours = 0;
			if(minutes>=60) {
				 hours = minutes/60;
				 minutes %= 60;
			}
			return hours + " h " + minutes + " m " + seconds + " s";
		}
		return "Invalid parameters";
	}
	
	public static String getDuration(int seconds) {
		
		if(seconds>=0){
			int minutes = 0;
			if(seconds>=60) {
				minutes = seconds/60;
				seconds %= 60;
			}
			System.out.println(getDuration(minutes, seconds));
			return minutes + " m " + seconds + " s";
			
		}
		return "Invalid parameters";
	}
	
}	
