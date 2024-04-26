package basic;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
	//Variables
		int myNum = 5; //primitive data type
		String website = "Rahul Shetty Academy"; //non-primitive data type
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
	//Printing in Java
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		
	//Arrays
		//Method 1
		int[] arr = new int[5]; //Declaring an array without initialization
		arr[0] = 1; //Initializing the values within the array
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//Method 2
		int[] arr1 = {1,2,3,4,5}; //Another way of initializing and declaring an array together
		System.out.println(arr1[3]);
		
	//Loop
		//for loop on integer array
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		//for loop on string array
		String[] name = {"rahul", "shetty", "selenium"};
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced for loop
		for(String s : name)
		{
			System.out.println(s);
		}
	}

}
