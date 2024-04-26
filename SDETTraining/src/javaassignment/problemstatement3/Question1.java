package javaassignment.problemstatement3;

public class Question1 {
	private double length;
	private double breadth;

	// Default constructor
	public Question1() {
		this.length = 10;
		this.breadth = 10;
	}

	// Parameterized constructor
	public Question1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Getter methods
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	// Main method to test the functionality
	public static void main(String[] args) {
		// Creating a Rectangle object using default constructor
		Question1 defaultRectangle = new Question1();
		System.out.println("Default Rectangle:");
		System.out.println("Length: " + defaultRectangle.getLength());
		System.out.println("Breadth: " + defaultRectangle.getBreadth());

		// Creating a Rectangle object using parameterized constructor
		Question1 customRectangle = new Question1(5, 7);
		System.out.println("\nCustom Rectangle:");
		System.out.println("Length: " + customRectangle.getLength());
		System.out.println("Breadth: " + customRectangle.getBreadth());
	}
}
