package javaassignment.problemstatement3;

public class Question2 {
	private double length;
	private double breadth;

	// Parameterized constructor
	public Question2(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Static method to flip the dimensions of a rectangle
	public static Question2 flipRectangle(Question2 rectangle) {
		// Creating a new Rectangle object with flipped dimensions
		Question2 flippedRectangle = new Question2(rectangle.getBreadth(), rectangle.getLength());
		return flippedRectangle;
	}

	// Getter methods
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	// Method to display the dimensions of the rectangle
	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}

	// Main method to test the functionality
	public static void main(String[] args) {
		// Creating a Rectangle object using parameterized constructor
		Question2 rectangle = new Question2(5, 7);

		// Display original rectangle dimensions
		System.out.println("Original Rectangle:");
		rectangle.display();

		// Flipping the rectangle
		Question2 flippedRectangle = Question2.flipRectangle(rectangle);

		// Display flipped rectangle dimensions
		System.out.println("\nFlipped Rectangle:");
		flippedRectangle.display();
	}
}