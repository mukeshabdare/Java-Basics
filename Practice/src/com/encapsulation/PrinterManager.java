package com.encapsulation;

public class PrinterManager {

	public static void main(String[] args) {

		Printer printer = new Printer("Dell", 70, true);
		
		printer.printPages(400);
		
		if(printer.getTonerLevel()<=20) {
			printer.fillUpToner(50);
		}
		
	}

}
