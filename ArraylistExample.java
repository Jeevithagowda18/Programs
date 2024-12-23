package Program712;

import java.util.ArrayList;
public class ArraylistExample 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		// add() is used to add an object into collections
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		System.out.println(a1);
		
		//size() is used to return the length of collection
		System.out.println(a1.size());
		
		//get() is used to return an object baesd on the index position
		System.out.println(a1.get(1));
	}
}
