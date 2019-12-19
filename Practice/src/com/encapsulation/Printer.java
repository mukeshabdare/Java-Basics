package com.encapsulation;

public class Printer {

	private String name;
	private int tonerLevel;
	private int noOfPagesPrinted;
	private boolean isDuplex;
	/**
	 * @param name
	 * @param tonerLevel
	 * @param noOfPagesPrinted
	 * @param isDuplex
	 */
	public Printer(String name, int tonerLevel, boolean isDuplex) {
		this.name = name;
		if(tonerLevel>=0 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}
		this.noOfPagesPrinted = 0;
		this.isDuplex = isDuplex;
	}
	public String getName() {
		return name;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getNoOfPagesPrinted() {
		return noOfPagesPrinted;
	}
	public boolean isDuplex() {
		return isDuplex;
	}
	
	public void fillUpToner(int tonerLevel) {
		if(tonerLevel>0 && (tonerLevel+this.tonerLevel)<=100) {
			this.tonerLevel+=tonerLevel;
			System.out.println("Toner is filled. Toner Level is "+this.tonerLevel);
		}
	}
	
	public void printPages(int noOfPages) {
		
		if((this.tonerLevel -= noOfPages/4) >= 0) {
			if(this.isDuplex) {
				this.noOfPagesPrinted += noOfPages/2;
			} else {
				this.noOfPagesPrinted += noOfPages;
			}
			System.out.println("Toner level is: "+this.tonerLevel);
			System.out.println("Total pages printed are :"+this.noOfPagesPrinted);
		} else {
			System.out.println("Error : Tonner ran out of ink. Current level is :"
					+this.tonerLevel);
		}	
			
	}
	
}
