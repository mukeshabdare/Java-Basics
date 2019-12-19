package com.practice;

public class ShapeImpl implements Shape {

	public ShapeImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape si = new ShapeImpl();
		Shape.draw();
		System.out.println(checkReverse(5001));
		
	}

	static boolean checkReverse(int number) {
		
		int temp = number;
		int reverseNumber = 0, reminder;
			while(temp>0) {
				reminder = temp%10;
				reverseNumber = reverseNumber*10 + reminder;
				System.out.println(reverseNumber);
				temp/=10;
			}
			if(reverseNumber==number) {
				return true;
			}
		
		return false;
		
	}
}
