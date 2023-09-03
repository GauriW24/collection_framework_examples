package collection_framework;
import java.util.*;
public class sortedSetExample 
{
	public static void main(String args[])
	{
		SortedSet<Integer> ss = new TreeSet<Integer>();
		Set.of();
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add(40);
		ss.add(50);
		
		System.out.println(ss);
		
		//accessing the elements
		Integer check = 50;
		if(ss.contains(check))
			System.out.println(check + " is present");
		
		System.out.println("First: " + ss.first());
		System.out.println("Last: " + ss.last());
		//subset
		System.out.println(ss.subSet(10, 30));
		//headset - returns elements who are strictly
		//less than given element i.e(40). in this case
		System.out.println("headSet: " + ss.headSet(40));
		
		//tailSet - return elements that are >= given element
		//i.e(50) in this case
		System.out.println("tailSet: " + ss.tailSet(50));
	}
}
