package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class  IteratorExample{

	public static void main(String[] args) {

		Set<Integer> set= new HashSet<>();
		set.add(1);
		set.add(10);
		set.add(13);
		set.add(16);
		set.add(18);
		set.add(100);
		set.addAll(set);
		
			
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
