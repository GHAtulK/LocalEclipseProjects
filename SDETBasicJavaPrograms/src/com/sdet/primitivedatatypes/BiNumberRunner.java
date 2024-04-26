package com.sdet.primitivedatatypes;

public class BiNumberRunner {

	public static void main(String[] args) {

		// Use Ctrl+1 for correcting errors in Eclipse

		BiNumber numbers = new BiNumber(2,3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue(); // Double both numbers
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
