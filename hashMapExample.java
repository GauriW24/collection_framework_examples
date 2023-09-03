package collection_framework;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
		HashMap<Integer,Double> hm2 = new HashMap<Integer,Double>();
		System.out.println(hm.size());
		//put
		hm.put(1, 95.2);
		hm.put(2, 89.36);
		hm.put(3, 89.0);
		hm.put(4, 63.1);
		hm.put(5, 79.7);
		
		for(Map.Entry<Integer, Double> entry: hm.entrySet())
		{
			Integer key = entry.getKey();
			Double value = entry.getValue();
			System.out.println("Key: " + key + " Value: " + value);
		}
		for(int i=1; i<hm.size(); i++)
			System.out.println(hm.get(i));
		
		if(hm.containsKey(2))
			System.out.println("key present");
		else
			System.out.println("key not present");
		
//		System.out.println(hm.remove(2));
//		System.out.println(hm);
		
		Set<Map.Entry<Integer, Double>> entry = hm.entrySet();
		
		hm2.putAll(hm);
		System.out.println(hm2);
		
		System.out.println(hm2.hashCode());
		
		for(Map.Entry<Integer, Double> entry1: hm.entrySet())
		{
			Integer key = entry1.getKey();
			System.out.println("hashcode: " + key.hashCode());
			System.out.println("size" + hm.size());
		}
		
		
		
	}
}
