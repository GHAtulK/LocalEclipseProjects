package sdetseleniumassignment;

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		System.out.println("====Question 3====");
		Scanner scanner = new Scanner(System.in);

		// Step 1: Ask the user for the number of entries (N)
		System.out.print("Enter the number of entries (N): ");
		int numberOfEntries = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Step 2: Ask the user to input N comma-separated numbers
		System.out.print("Enter " + numberOfEntries + " comma-separated numbers: ");
		String input = scanner.nextLine();

		// Step 3: Split the input string into an array of numbers
		String[] numbersAsString = input.split(",");
		int[] numbers = new int[numberOfEntries];

		// Step 4: Convert the string array to an integer array
		for (int i = 0; i < numberOfEntries; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i].trim());
		}

		// Step 5: Print the entered numbers
		System.out.print("Entered numbers: ");
		for (int i = 0; i < numberOfEntries; i++) {
			System.out.print(numbers[i]);
			if (i != numberOfEntries - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		scanner.close();
		System.out.println("====End of Question 3====");
	}

}