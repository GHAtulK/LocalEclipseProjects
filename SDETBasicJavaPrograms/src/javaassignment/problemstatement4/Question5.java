package javaassignment.problemstatement4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
	public static void main(String[] args) {
		String fileName = "example.txt"; // Name of the file

		// Writing to a file
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("Hello, this is a test content!\n");
			writer.write("Writing to a file in Java.\n");
			writer.close();
			System.out.println("Content has been written to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		}

		// Reading from a file
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;

			System.out.println("\nReading content from the file:");
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			System.out.println("An error occurred while reading from the file: " + e.getMessage());
		}
	}
}
