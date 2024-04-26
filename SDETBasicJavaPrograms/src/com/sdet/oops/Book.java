package com.sdet.oops;

public class Book {

	private int noOfCopies; // This is encapsulation as other classes won't be able to access this variable
	void read() {
		System.out.println("Reading a book");
	}

	void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies; // this.noOfCopies is member variable of class and noOfCopies is local variable
		// of the method
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

}
