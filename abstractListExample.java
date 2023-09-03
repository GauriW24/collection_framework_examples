package collection_framework;
import java.util.*;
import java.util.TreeSet;
import java.util.Scanner;

public class abstractListExample 
{
	public static void main(String args[])
	{
		//all operations same as array and linked list
		AbstractList<Integer> list = new ArrayList<Integer>();
		//1. add element
		//a.
		list.add(4);
		list.add(8);
		list.add(12);
		list.add(16);
		list.add(20);
		System.out.println(list);
		//b. add element at specific index 
		list.add(5, 24);
		System.out.println(list);
	}
}
