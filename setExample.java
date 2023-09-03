package collection_framework;
import java.util.*;
public class setExample
{
	private static final int Integer = 0;

	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		//don't give error but print 1 at only once
		
		Integer[] A = {10,20,30,40};
		Integer[] B = {11,20,33,40};
		
		Set<Integer> setOne = new HashSet<Integer>();
		setOne.addAll(Arrays.asList(A));
		Set<Integer> setTwo = new HashSet<Integer>();
		setTwo.addAll(Arrays.asList(B));
		System.out.println(set);
		
		//union
		Set<Integer> union = new HashSet<Integer>(setOne);
		union.addAll(setTwo);
		System.out.println("Set of two union is: " + union);
	
		//intersection
		Set<Integer> intersection = new HashSet<Integer>(setOne);
		intersection.retainAll(setTwo);
		System.out.println("Intersection is: " + intersection);
		
		//finding difference
		Set<Integer> difference = new HashSet<Integer>(setOne);
		difference.removeAll(setTwo);
		System.out.println("Difference of two sets: "+difference);
		
	}
}
