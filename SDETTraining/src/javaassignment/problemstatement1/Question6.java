package javaassignment.problemstatement1;

public class Question6 {

	public static void main(String[] args) {
		// Create an array of 5 strings
		String[] arr = new String[5];

		// Initialize the array
		arr[0] = "This";
		arr[1] = "is";
		arr[2] = "a";
		arr[3] = "java";
		arr[4] = "assignment";

		// Print the array in reverse order using a while loop
		int i = arr.length - 1;
		while (i >= 0) {
			System.out.println(arr[i]);
			i--;
		}
	}
}
