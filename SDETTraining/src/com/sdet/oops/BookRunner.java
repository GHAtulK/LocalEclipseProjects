package com.sdet.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		artOfComputerProgramming.setNoOfCopies(50);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.setNoOfCopies(45);
		System.out.println(effectiveJava.getNoOfCopies());
		cleanCode.setNoOfCopies(20);
		System.out.println(cleanCode.getNoOfCopies());
	}

}
