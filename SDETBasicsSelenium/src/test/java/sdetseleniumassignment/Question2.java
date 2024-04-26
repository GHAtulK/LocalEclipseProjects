package sdetseleniumassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("====Question 2====");

		Scanner scanner = new Scanner(System.in);
		// Step 1: Ask the user for the number of entries (N)
		System.out.print("Enter the number of entries (N): ");
		int numberOfEntriesQ2 = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Step 2: Ask the user to input N comma-separated numbers
		System.out.print("Enter " + numberOfEntriesQ2 + " comma-separated numbers: ");
		String input = scanner.nextLine();

		// Step 3: Split the input string into an array of numbers
		String[] numbersAsString = input.split(",");
		int[] numbers = new int[numberOfEntriesQ2];

		// Step 4: Convert the string array to an integer array
		for (int i = 0; i < numberOfEntriesQ2; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i].trim());
		}

		// Step 5: Print the entered numbers
		System.out.println("Entered numbers: " + Arrays.toString(numbers));

		scanner.close();
		System.out.println("====End of Question 2====");
	}

}
