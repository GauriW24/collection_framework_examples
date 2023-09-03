package collection_framework;
import java.util.*;

public class QueueExample extends ArrayDeque<Integer>
{

	public static void main(String[] args) 
	{
//		Queue<Integer> q1 = new ArrayDeque<Integer>(7);
//		
//		q1.add(10);
//		q1.add(8);
//		q1.add(6);
//		q1.add(40);
//		q1.add(2);
//		System.out.println(q1);
//		System.out.println(q1.peek());
//		System.out.println(q1.remove(2));
//		System.out.println(q1);
//
//		 System.out.println(q1);
//		Deque<Integer> q3 = new ArrayDeque<Integer>();
//		Collections.synchronizedCollection(q3);//making q3 synchronize
//		QueueExample q1 = new QueueExample();
//		ArrayDeque<Integer> q2 = new QueueExample();
//		q1.add(20);
//		q1.add(30);
//		q1.add(40);
//		q1.addFirst(10);
//		q1.addLast(020);
//		System.out.println(q1);
//		q2 = q1.clone();
//		System.out.println(q2);
//		
//		//print in descending order
//		Iterator itr = q1.descendingIterator();
//		while(itr.hasNext())
//			System.out.print(itr.next() + " ");
//		
//		int element = q1.element();
		//this element() method retrive head of queue but
		//not remove
//		System.out.println("\n" + element);
		
		Queue<Integer> qu1 = new ArrayDeque<Integer>();
		qu1.add(10);
		qu1.add(20);
		qu1.add(30);
		qu1.add(40);
		qu1.add(50);
		
		//add element at last 
		qu1.offer(1);
		for(int val: qu1)
			System.out.println(val);
		
		//pick first element from queue
		System.out.println(qu1.peek());
		
		//retrive and remove head of queue
		System.out.println(qu1.poll());
		
		System.out.println(qu1);
	}

}
