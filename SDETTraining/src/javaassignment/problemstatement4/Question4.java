package javaassignment.problemstatement4;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your email: ");
		String email = scanner.next();

		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);

		scanner.close();
	}
}