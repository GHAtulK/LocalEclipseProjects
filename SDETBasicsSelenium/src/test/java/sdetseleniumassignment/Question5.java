package sdetseleniumassignment;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Ask the user for the number of entries (N)
		System.out.print("Enter the number of entries (N): ");
		int numberOfEntries = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Step 2: Ask the user to input N comma-separated numbers for the first array
		System.out.print("Enter " + numberOfEntries + " comma-separated numbers for the first array: ");
		String inputArray1 = scanner.nextLine();

		// Step 3: Convert the comma-separated input string to an array of integers
		// (Array1)
		String[] numbersAsStringArray1 = inputArray1.split(",");
		int[] array1 = new int[numberOfEntries];
		for (int i = 0; i < numberOfEntries; i++) {
			array1[i] = Integer.parseInt(numbersAsStringArray1[i].trim());
		}

		// Step 4: Ask the user to input N comma-separated numbers for the second array
		System.out.print("Enter " + numberOfEntries + " comma-separated numbers for the second array: ");
		String inputArray2 = scanner.nextLine();

		// Step 5: Convert the comma-separated input string to an array of integers
		// (Array2)
		String[] numbersAsStringArray2 = inputArray2.split(",");
		int[] array2 = new int[numberOfEntries];
		for (int i = 0; i < numberOfEntries; i++) {
			array2[i] = Integer.parseInt(numbersAsStringArray2[i].trim());
		}

		// Step 6: Perform element-wise multiplication and store the result in a third
		// array (Array3)
		int[] array3 = new int[numberOfEntries];
		for (int i = 0; i < numberOfEntries; i++) {
			array3[i] = array1[i] * array2[i];
		}

		// Step 7: Print the multiplied array (Array3)
		System.out.print("Multiplied array (Array3): ");
		printIntArray(array3);
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
