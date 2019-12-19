package com.practice;

public class DayOfWeek {

	public static void main(String[] args) {

		String[] daysArray = new String[]{"Sun","Tues","Fri","Wed","Sat","Thurs","Mon"}; 
		daysArray = sortDayOfWeekInline(daysArray);
		for(int i=0; i<daysArray.length; i++) {
			System.out.println(daysArray[i]);
		}
	}

	private static String[] sortDayOfWeek(String[] days) {
		String [] sortedDays = new String[days.length];
		for(int i = 0; i < days.length; i++) {
			switch(days[i]) {
			
			case "Mon" : sortedDays[0] = days[i];
			break;
			
			case "Tues" : sortedDays[1] = days[i];
			break;
			
			case "Wed" : sortedDays[2] = days[i];
			break;
			
			case "Thurs" : sortedDays[3] = days[i];
			break;
			
			case "Fri" : sortedDays[4] = days[i];
			break;
			
			case "Sat" : sortedDays[5] = days[i];
			break;
			
			case "Sun" : sortedDays[6] = days[i];
			break;
			}
		}
		
		return sortedDays;
		
	}
	
	private static String[] sortDayOfWeekInline(String[] days) {
		for(int i = 0 ; i< days.length; i++) {
			String tempDay;
			if(days[i].equals("Mon") && i!=0) {
				tempDay = days[0];
				days[0] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Tues") && i!=1) {
				tempDay = days[1];
				days[1] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Wed") && i!=2) {
				tempDay = days[2];
				days[2] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Thurs") && i!=3) {
				tempDay = days[3];
				days[3] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Fri") && i!=4) {
				tempDay = days[4];
				days[4] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Sat") && i!=5) {
				tempDay = days[5];
				days[5] = days[i];
				days[i] = tempDay;
			}
			
			if(days[i].equals("Sun") && i!=6) {
				tempDay = days[6];
				days[6] = days[i];
				days[i] = tempDay;
			}
		}
		return days;
		
	}
}
