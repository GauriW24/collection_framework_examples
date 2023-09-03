package collection_framework;
import java.util.*;
public class abstractQueueExample 
{
	public static void main(String[] args) 
	{
		AbstractQueue<Integer> queue = new PriorityQueue<Integer>();
		AbstractQueue<String> queue2 = new PriorityQueue<String>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		 
//		queue2.add(1);
//		queue2.add(2);
//		queue2.add(3);
//		queue2.add(4);
//		queue2.add(5);
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue.element());
		
		
		System.out.println(queue.hashCode());
		System.out.println(queue2.hashCode());
		System.out.println(queue.equals(queue));
		
	}
}
