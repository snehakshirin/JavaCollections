package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistPractice {

	public static void main(String[] args) {
		
		Integer[] arr= new Integer[] {1,2,3,4,5};
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		al.add(1);
		System.out.println(al.size());
		al.ensureCapacity(10);
		System.out.println(al.size());
		for(Integer e: al) {
			System.out.println(e);
		}
		Collections.synchronizedList(al);
		
	}

}
