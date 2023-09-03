package collection_framework;
import java.util.*;
import java.lang.Object;

public class stackExample 
{
	public static void main(String[] args) 
	{
		Stack stk1 = new Stack();
				
		stk1.push(10);
		stk1.push(20);
		stk1.push(30);
		stk1.push(40);
		stk1.push(50);
		stk1.push("gauri");
		System.out.println(stk1);
		
		Stack<Integer> stk2 = new Stack<Integer>();
		stk2.push(1);
		stk2.push(2);
		stk2.push(3);
		System.out.println(stk2);
		
		System.out.println(stk2.peek());
		
		//search - this method returns distance 
		//from top of the stack to occurance of top of the stack
		System.out.println(stk1.search(50));
		
		
	}
}
