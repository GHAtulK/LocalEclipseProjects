package basic;

public class CoreJavaMethods {

	public static void main(String[] args) {
		
		CoreJavaMethods d = new CoreJavaMethods(); //Create object of the class to access the methods within the class
		String name = d.getData(); //Call the method using the object and store the returned value in a variable
		System.out.println(name);

		CoreJavaMethods2 d1 = new CoreJavaMethods2(); //Create object of another class with private method
		String name1 = d1.getUserData(); //Call the method using the object and store the returned value in a variable
		System.out.println(name1);
		
		getStaticData(); //Static methods can be called without creating object
		
	}

	//Always create methods outside the main() block
	
	public String getData()
	{
		System.out.println("Hello World!");
		return "Rahul Shetty";
	}
	
	public static void getStaticData() //This is a static method which doesnt require an object to be called
	{
		System.out.println("Hello World to static method!");
	}
	
}
