package collection_framework;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class mapExample 
{
	public static void main(String[] args) 
	{
		//create Map
		Map<Integer, String> mp = new HashMap<Integer, String>();
		//put values
		mp.put(101, "Gauri Wadekar");
		mp.put(102, "Bhavana Madas");
		mp.put(103, null);
		mp.put(104, "hina Kadam");
		mp.put(105, null);
		mp.put(106, null);
		
		System.out.println("size: " + mp.size());
		
		//get value
		String value = mp.get(103);
		System.out.println(value);
		
//		System.out.println(mp);
		
		//check key present or not
		if(mp.containsKey(105))
			System.out.println("Key present");
		else
			System.out.println("Key not present");
		
		//remove key val pair
		System.out.println("remove 101: " + mp.remove(101));
		System.out.println("remove bhavana: " + mp.remove(102 , "Bhavana Madas"));
		System.out.println("Map: " + mp);
		
		mp.put(101, "Gauri Wadekar");
		mp.put(102, "Bhavana Madas");
		
		//printing only keys
		System.out.println("Printing keys only");
		Set<Integer> keys = mp.keySet();
		System.out.println("Keys are: ");
		for(int key: keys)
			System.out.println(key);
		
		//printing only values
		System.out.println("Printing values only");
		Collection<String> val = mp.values();
		for(String mapValue: val)
			System.out.println(mapValue);
		
		//printing both key and value
		System.out.println("Printing key-value pair");
		for(Map.Entry<Integer, String> entry: mp.entrySet()) 
		{
			Integer key = entry.getKey();
			String values = entry.getValue();
			System.out.println(key + " " + values);
		}
			
		mp.put(102, "Aastha Pdesai");
		System.out.println(mp);
		
		Map<Integer, Double> mp2 = new HashMap<Integer, Double>();
		mp2.put(1, 90.23);
		mp2.put(2, 98.34);
		mp2.put(3, 85.22);
		mp2.put(4, 86.51);
		
		System.out.println("Map: " + mp2);
		
		//use copyOf to make map unmodifiable
		Map<Integer, Double> mp3 = Map.copyOf(mp2);
		System.out.println(mp3);
		mp3.put(5, 86.11);
		
		
	}
}
