package com.sdet.primitivedatatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// a,e,i,o,u,A,E,I,O,U
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel");
			return true;
		}
		System.out.println(ch + " is not a vowel");
		return false;
	}

	public boolean isDigit() {
		// Use Ascii value of 0 to 9
		if (ch >= 48 && ch <= 57) {
			System.out.println(ch + " is a digit");
			return true;
		}
		System.out.println(ch + " is not a digit");
		return false;
	}

	public boolean isAlphabet() {
		// between a and z or A and Z
		if (ch >= 97 && ch <= 122) {
			System.out.println(ch + " is an alphabet");
			return true;
		}
		if (ch >= 65 && ch <= 90) {
			System.out.println(ch + " is an alphabet");
			return true;
		}
		System.out.println(ch + " is not an alphabet");
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			System.out.println(ch + " is a consonant");
			return true;

		}
		System.out.println(ch + " is a consonant");
		return false;
	}

	public static void printLowerCaseAlphabets() {

		// a to z
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);

		}
	}

	public static void printUpperCaseAlphabets() {
		// A to Z
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}



}
