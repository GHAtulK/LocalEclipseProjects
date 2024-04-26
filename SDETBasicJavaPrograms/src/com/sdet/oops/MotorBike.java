package com.sdet.oops;

public class MotorBike {

	private int speed; // This is encapsulation as other classes won't be able to access this variable

	void start() {

		System.out.println("Bike started");
	}

	void stop() {
		System.out.println("Bike stopped");
	}

	void setSpeed(int speed) {
		this.speed = speed; // this.speed is member variable of class and speed is local variable of the
		// method
	}
	int getSpeed() {
		return this.speed;
	}
}

