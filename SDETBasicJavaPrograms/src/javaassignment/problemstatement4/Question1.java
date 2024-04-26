package javaassignment.problemstatement4;

import java.util.Calendar;

public class Question1 {

	public static void main(String[] args) {

		// Get the default instance of Calendar
		Calendar calendar = Calendar.getInstance();

		// Get year, month, day, hour, and minute
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // Month starts from 0
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);

		// Display the information
		System.out.println("Current Date and Time:");
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
	}
}