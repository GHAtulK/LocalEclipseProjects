package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaArrayList {

	public static void main(String[] args) {
		
		//ArrayList can create dynamic arrays without any fixed length
		ArrayList<String> a = new ArrayList<String>(); //Create object of ArrayList class with string data type
		a.add("Rahul"); //Add value at 0 index
		a.add("Shetty");
		a.add("Selenium");
		a.remove(2); //Remove the value stored at 2 index
		System.out.println(a.get(1)); //Get method can be used to fetch the value at 1 index
		System.out.println(a.size()); //Fetch the size of an arraylist
		
		//Normal for loop
		System.out.println("*****************");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*****************");
		
		//Enhanced for loop
		for(String val : a)
		{
			System.out.println(val);
		}
		System.out.println("*****************");
		
		//Check if any value is present within an arraylist or not
		System.out.println(a.contains("Shetty"));
		
		System.out.println("*****************");
		
		//Convert normal array to array list
		String[] name = {"Rahul" , "Shetty", "Selenium"};
		List<String> nameArrayList = Arrays.asList(name); //List is the superclass for ArrayList
		
		System.out.println(nameArrayList.contains("Selenium"));
		
		
		
		
	}

}
