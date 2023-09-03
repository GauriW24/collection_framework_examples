package collection_framework;
import java.util.*;
public class navigableSetExample
{							
	public static void main(String[] args) 
	{
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		ns.add(7);
		ns.add(8);
		ns.add(9);
		
		System.out.println("Normal order: " + ns);
		System.out.println("Descending order: " + ns.descendingSet());
	
		System.out.println(ns.tailSet(3,true));
		System.out.println(ns.lower(6));
		System.out.println(ns.floor(6));
		System.out.println(ns.higher(6));
		System.out.println(ns.ceiling(6));
		
		Iterator itr = ns.descendingIterator();
		System.out.println("set in descending order is: ");
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
