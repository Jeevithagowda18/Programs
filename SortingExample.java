package Program2412;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(30);
		a1.add(40);
		a1.add(10);
		a1.add(20);
		
		System.out.println("Before Sorting:");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		Collections.sort(a1);
		
		System.out.println("After Sorting:");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}

}
