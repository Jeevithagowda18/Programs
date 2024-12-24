package Program2412;

public class ExampleForEnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int []arr = {10,20,30,40,50};
		
		System.out.println("Using For Loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Using For Each Loop: ");
		
		for(int j : arr)
		{
			System.out.println(j);
		}
	}
}
