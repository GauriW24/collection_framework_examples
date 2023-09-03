package collection_framework;
import java.util.*;
public class linkedHashMapExample 
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(41, "abc");
		lhm.put(42, "def");
		lhm.put(43, "ghi");
		System.out.println(lhm);
		System.out.println(lhm);
		System.out.println(lhm);
		
		for(Map.Entry<Integer, String> entry: lhm.entrySet())
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
 			System.out.println("Key: " + key + " value: " + value);
		}
		
		Set<Map.Entry<Integer, String>> entries = lhm.entrySet();
		System.out.println(entries);
		
		lhm.clear();
		System.out.println(lhm);
	}
}
