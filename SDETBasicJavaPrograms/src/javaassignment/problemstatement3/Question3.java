package javaassignment.problemstatement3;

abstract class Shape {
	protected double dim1;
	protected double dim2;

	public Shape(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	// Abstract method to calculate area
	public abstract double calculateArea();
}

class Rectangle extends Shape {
	public Rectangle(double length, double width) {
		super(length, width);
	}

	// Implementation of calculateArea for Rectangle
	@Override
	public double calculateArea() {
		return dim1 * dim2;
	}
}

class Circle extends Shape {
	public Circle(double radius) {
		super(radius, 0); // Only one dimension required for a circle
	}

	// Implementation of calculateArea for Circle
	@Override
	public double calculateArea() {
		return Math.PI * dim1 * dim1;
	}
}

class Triangle extends Shape {
	public Triangle(double base, double height) {
		super(base, height);
	}

	// Implementation of calculateArea for Triangle
	@Override
	public double calculateArea() {
		return 0.5 * dim1 * dim2;
	}
}

public class Question3 {
	public static void main(String[] args) {
		// Creating instances of each shape
		Rectangle rectangle = new Rectangle(5, 7);
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(4, 6);

		// Calculating and printing the area of each shape
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
		System.out.println("Area of Circle: " + circle.calculateArea());
		System.out.println("Area of Triangle: " + triangle.calculateArea());
	}
}
