package com.sdet.basic;

public class MultiplicationTable {
	// 5*1 = 5
	// 5+10 =50

	void print() {
		print(5);
	}
	void print(int value) {   //this is method overloading
		print(value, 1, 10);
	}
	void print(int value, int from, int to) {   //this is again method overloading
		for (int i = from; i<=to; i++) {
			System.out.printf("%d x %d = %d", value, i, value * i).println();
		}
	}

}

