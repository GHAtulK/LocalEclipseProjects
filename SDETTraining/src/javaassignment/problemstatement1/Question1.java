package javaassignment.problemstatement1;

public class Question1 {

	/*
	 * Question: Write the program based on variables and types of variables in java
	 * and write the program to type’s caste int datatype into float datatype in
	 * java.
	 */

	public static void main(String[] args) {

		// Declare an int variable
		int myInt = 20;

		// Declare a float variable
		float myFloat = 6.45f;

		// Print the values of the variables
		System.out.println("The value of myInt is: " + myInt);
		System.out.println("The value of myFloat is: " + myFloat);

		// Type cast the int variable to a float variable
		myFloat = myInt;

		// Print the value of the float variable
		System.out.println("The value of myFloat after type casting is: " + myFloat);
	}
}
