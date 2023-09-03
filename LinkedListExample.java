package collection_framework;
import java.util.*;

public class LinkedListExample 
{
	public static void main(String[] args) 
	{
		//1. create LinkedList
		//List<Integer> list = new LinkedList<>();
		//above declaration can't provide getFirst or get last type 
		//of operations 
		LinkedList<Integer> list = new LinkedList<>();
		//2. Add element to linked list
		//a. add element
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		System.out.println(list);
		//b. add element at specific index
		list.add(5, 12);
		System.out.println(list);
		//c. add element at first
		list.addFirst(0);
		System.out.println(list);
		//d. add element at last
		list.addLast(14);
		System.out.println(list);
		
		//3. Access elements
		//a. access elements at specific index
		System.out.println(list.get(3));
		//b. access first element
		System.out.println(list.getFirst());
		//c. access last element
		System.out.println(list.getLast());
		
		//4. Iterate through the list
		System.out.println("list element using for each loop");
		for(int val: list)
			System.out.println(val);
		
		//5. check element presence
		if(list.contains(5))
			System.out.println("present");
		else
			System.out.println("not-present");
		
		//6. get size of linkedList
		System.out.println("size of linked list is: " + list.size());
	
		//7. remove element
		//a. 
		list.remove(); //delete first element by default
		System.out.println(list);
		//b. delete element at specific index
		list.remove(2);
		System.out.println(list);
		//c. remove first element
		list.removeFirst();
		System.out.println(list);
		//c. remove first element
		list.removeLast();
		System.out.println(list);
		
		//8. clear linked list
		//list.clear();
		//System.out.println(list);
		
		//9. check list is empty or not
		if(list.isEmpty())
			System.out.println("empty");
		else
			System.out.println("not empty");
		
		//10. replace element
		list.set(0, 2);
		list.set(3, 14);
		System.out.println(list);
		
		list.add(2);
		System.out.println(list);
		
		//11. index of element
		System.out.println(list.indexOf(2));
		System.out.println(list.lastIndexOf(2));
		
		//12. extract sublist 
		List<Integer> sublist = list.subList(0, 3);
		System.out.println(sublist);
		
		//13. convert linked list to array
		System.out.println("array");
		Integer[] array = list.toArray(new Integer[list.size()]);
		for(Integer val: array)
			System.out.println(val);
		
		//14. sort the linked list
		Collections.sort(list);
		System.out.println(list);
		
		//15. reverse
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
