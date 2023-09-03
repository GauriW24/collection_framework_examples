package collection_framework;
import java.util.*;
public class PriorityQueueExample 
{
	public static void main(String[] args) 
	{		
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		System.out.println(pq.peek());
		//return and remove head of the queue
		System.out.println(pq.poll());
		System.out.println(pq);
		
		Queue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.add(500);
		pq1.add(30);
		pq1.add(600);
		pq1.add(700);
		pq1.add(900);
//		pq1.add(null);
		System.out.println(pq1.size());
		
		
	}
}
