package com.sdet.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		ducati.stop();

		honda.start();
		honda.stop();

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
	}

}
