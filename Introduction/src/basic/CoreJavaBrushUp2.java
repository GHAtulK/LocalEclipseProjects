package basic;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6,7,8,9,10,122};
		
		//Need to write a code to identify only those values within the array which are multiples of 2
		//Expected Output = 2,4,6,8,10,122
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
			System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i] + " is not a multiple of 2");
			}
		}
		
		//Write a for loop to identify if array has multiple of 2, exit the loop as soon as it encounters a multiple
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
			System.out.println(arr[i]);
			System.out.println("Encountered a multiple of 2 at the index "+i+", exiting the loop");
			
			break;
			}
			else {
				System.out.println(arr[i] + " is not a multiple of 2");
			}
		}
		
	}
}
