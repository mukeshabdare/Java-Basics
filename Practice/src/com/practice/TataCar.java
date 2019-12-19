package com.practice;

public class TataCar extends Vehicle {

	public TataCar() {
		// TODO Auto-generated constructor stub
	}
	
	private String model;
	private String color;
	private String passingState;
	
	public void move(){
		System.out.println("Moving wit speed:" +this.getSpeed());
	}	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPassingState() {
		return passingState;
	}
	public void setPassingState(String passingState) {
		this.passingState = passingState;
	}
	
	
}
