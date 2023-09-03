package collection_framework;
import java.util.*;

public class treeMapExample 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		map.put(1, "India");
		map.put(3, "US");
		map.put(2, "Rassia");
		map.put(5, "Canada");
		map.put(4, "Korea");
		//print (k-v) pair
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		
		//remove
		map.remove(3);
		
		System.out.println();
		System.out.println("After removing: ");
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() + ":" + m.getValue());
		
		}
		
		//print in decsending order
		System.out.println("Descending order map: " + map.descendingMap());
		
		//headmap - return preceding key-value pair of specified key
		System.out.println("HeadMap: " + map.headMap(3));
	
		//tailMap - return aheding key-value pair of specified key
		System.out.println("tailMap: " + map.tailMap(1));
	
		//submap-
		System.out.println("SubMap: " + map.subMap(1, 3));
	}
}
