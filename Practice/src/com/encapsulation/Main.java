package com.encapsulation;

class Vehicle{
	
	private int noOfWheels;
	private boolean engine;
	private String cylinderName;
	private int cylinders;
	/**
	 * @param cylinderName
	 * @param cylinders
	 */
	public Vehicle(String cylinderName, int cylinders) {
		this.cylinderName = cylinderName;
		this.cylinders = cylinders;
		this.engine = true;
		this.noOfWheels =4;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public boolean isEngine() {
		return engine;
	}
	public String getCylinderName() {
		return cylinderName;
	}
	public int getCylinders() {
		return cylinders;
	}
	

	public void accelrate(int speed) {
		System.out.println("Car is runnig at speed "+speed);
	}
	
	public void applyBreak() {
		System.out.println("Break is pulled.");
	}
	
	public void startEngine() {
		System.out.println("Engine started");
	}
	
}

class Ford extends Vehicle{

	public Ford(String cylinderName, int cylinders) {
		super(cylinderName, cylinders);
	}

	@Override
	public void accelrate(int speed) {
		System.out.println("Ford is running at :"+speed);
	}

	@Override
	public void startEngine() {
		System.out.println("Ford is started");
	}
	
}




public class Main {

	public static void main(String[] args) {
		
		Vehicle figo = new Ford("Ford", 4);
		figo.startEngine();
		figo.accelrate(110);
		figo.applyBreak();
	}
}
