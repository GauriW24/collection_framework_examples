package collection_framework;
import java.util.*;
public class SortedMapExample 
{
	public static void main(String[] args) 
	{
		SortedMap<Integer, Double> sm = new TreeMap<Integer, Double>();
		sm.put(11, 60.23);
		sm.put(12, 70.29);
		sm.put(13, 96.2);
		sm.put(14, 88.3);
		sm.put(15, 76.2);
		
		System.out.println(sm);
		System.out.println(sm.subMap(11, 13));
		
		System.out.println(sm.headMap(13));//return values < 13 
		System.out.println(sm.tailMap(13));//return values >= 13
		
		sm.put(null, 20.56);
		sm.put(0, null);
		sm.put(16, null);
		System.out.println(sm);
		
	}
}
