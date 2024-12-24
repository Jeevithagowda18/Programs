package Program2412;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Java");
		a1.add("Python");
		a1.add("JavaScript");
		
		for(String s:a1)
		{
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		for(int i: ll)
		{
			System.out.println(i);
		}
	}

}
