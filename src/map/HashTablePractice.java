package map;


import java.util.*;
import java.util.Map.Entry;

public class HashTablePractice {

	public static void main(String[] args) {

		Map<Integer, String> m = new Hashtable<>();
		
		m.put(465606, "sneha");
		m.put(456272, "vinitha");
		m.put(477888, "soundarya");
		
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		
		Collection<String> keyvalues = m.values();
		System.out.println(keyvalues);
		
		for(Integer i : keys) {
			System.out.println(m.get(i));
		}
		
		
		Set<Entry<Integer, String>> entries=m.entrySet();
		for(Entry<Integer, String>entry : entries) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			

		}
		
		
	}

}
