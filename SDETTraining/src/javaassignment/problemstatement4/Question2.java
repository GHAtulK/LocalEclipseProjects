package javaassignment.problemstatement4;

public class Question2 {
	private final String value;

	public Question2(String value) {
		this.value = value;
	}

		public Question2 concat(String other) {
			return new Question2(this.value.concat(other));
	}

		public Question2 uppercase() {
			return new Question2(this.value.toUpperCase());
	}

		public Question2 lowercase() {
			return new Question2(this.value.toLowerCase());
	}

		public Question2 replace(String oldStr, String newStr) {
			return new Question2(this.value.replace(oldStr, newStr));
	}

	public String getValue() {
		return this.value;
	}

	public static void main(String[] args) {
			Question2 s1 = new Question2("Hello");
			Question2 s2 = s1.concat(" World");
		System.out.println("Original String: " + s1.getValue());
		System.out.println("Concatenated String: " + s2.getValue());

			Question2 s3 = s2.uppercase();
		System.out.println("Uppercase String: " + s3.getValue());

			Question2 s4 = s3.replace("WORLD", "Universe");
		System.out.println("Replaced String: " + s4.getValue());

			Question2 s5 = s4.lowercase();
		System.out.println("Lowercase String: " + s5.getValue());
	}
}
