package collection_framework;
import java.util.Vector;
import java.util.List;

public class vectorExample 
{
	public static void main(String[] args) 
	{
		//1. Create a vector
		List<Integer> vectorOne = new Vector<Integer>();
		Vector vector = new Vector(5);
		vector.addElement(20);
		vector.add(40);
		vector.add(50);
		vector.add(60);
		vector.add(70);
		vector.add(2, 60);
		//other all operations are same as arraylist
		vectorOne.addAll(0, vector);
		System.out.println("Vector: " + vector);
		System.out.println("VectorOne: " + vectorOne);
		
		System.out.println("element at 0: " + vector.elementAt(0));
		
		Object Clone = vector.clone();
		System.out.println("Clone Of vector is: " + Clone);
		
		int capacity = vector.capacity();
		System.out.println("capacity: " + capacity);
	
		System.out.println("converting to array:");
		Object arr[] = vector.toArray();
		for(Object val: arr)
			System.out.println(val);
		
		vector.add("Gauri");
		System.out.println(vector);
		
	}
}
