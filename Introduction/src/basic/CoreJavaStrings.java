package basic;

public class CoreJavaStrings {

	public static void main(String[] args) {
		
	//String is an object which represents a sequence of characters	
	//Declaring string using String Literal
	String s = "Rahul Shetty Academy";
	String s1 = "Rahul Shetty Academy"; //If text is same, java creates only one object in back end
	
	//Declaring string using new memory allocator
	String s2 = new String("Welcome"); //Another way of creating object
	String s3 = new String("Welcome"); //In this case, new object will be created even if text is same
	////////////////////////////////////
	
	String s4 = "Rahul Shetty Academy";
	System.out.println(s4);
	System.out.println("*****************");
	//s4.split(" "); //This will split the string into an array
	String[] splittedString = s4.split(" ");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	System.out.println(splittedString[2]);
	
	//Splitting based on a value other than white space
	System.out.println("*****************");
	String s5 = "Rahul Shetty Academy";
	String[] splittedString1 = s4.split("Shetty");
	System.out.println(splittedString1[0]);
	System.out.println(splittedString1[1]);
	System.out.println("*****************");
	System.out.println(splittedString1[1].trim()); //removes spaces
	
	//Print all characters of the string
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i)); //This will give each character within a string
	}
	
	//Print all characters of the string in reverse order
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i)); //This will give each character within a string
	}
	
	}

}
