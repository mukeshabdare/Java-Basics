package com.practice;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... args) {
		
		TataCar indigo = new TataCar();
		indigo.setColor("Blue");
		indigo.setModel("ECS");
		indigo.setPassingState("MH");
		indigo.setSpeed(50);
		
		System.out.println(indigo.getModel()+" from State " + indigo.getPassingState() + " color "+ indigo.getColor());
		indigo.move();
	}

}
