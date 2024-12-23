package Program712;
import java.util.LinkedList;
import java.util.List;
public class LinkedListExample 
{
	public static void main(String[] args) 
	{
		//LinkedList ll = new LinkedList();
		List ll = new LinkedList();
		ll.add(10);
		ll.add("JAVA");
		ll.add(45.5);
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println(ll.size());
	}
}
