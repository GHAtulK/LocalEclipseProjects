package sdetseleniumassignment;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Ask the user for the number of entries (N)
		System.out.print("Enter the number of entries (N): ");
		int numberOfEntries = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Step 2: Ask the user to input N comma-separated numbers
		System.out.print("Enter " + numberOfEntries + " comma-separated numbers: ");
		String input = scanner.nextLine();

		// Step 3: Convert the comma-separated input string to an array of integers
		String[] numbersAsString = input.split(",");
		int[] numbers = new int[numberOfEntries];
		for (int i = 0; i < numberOfEntries; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i].trim());
		}

		// Step 4: Print the entered numbers array
		System.out.print("Entered numbers array: ");
		printIntArray(numbers);
		System.out.println();

		scanner.close();
	}

	// Method to print an array of integers
	private static void printIntArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
