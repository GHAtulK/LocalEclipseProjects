package javaassignment.problemstatement4;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");
		String input = scanner.nextLine();

		try {
			int number = convertStringToInt(input);
			int result = 10 / number;
			System.out.println("Result: " + result);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occurred: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	public static int convertStringToInt(String input) throws NumberFormatException {
		return Integer.parseInt(input);
	}
}