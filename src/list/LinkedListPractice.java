package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListPractice {

	public static void main(String[] args) {

		
		LinkedList<Integer> ls = new LinkedList<>(); 
		List<Integer> ll = new LinkedList<>(); //only list methods can perform on the ll object
		Queue<Integer> lq= new LinkedList<>(); //only queue methods can perform on the lq object
		Deque<Integer> ld = new LinkedList<>(); // only deque methods can perform on the ld object
	
	
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(1);
		
		ls.add(10);
		ls.add(0,19);
		ls.addAll(0,al);
		ls.remove();
		ls.remove(0);
		
		System.out.println(ls.get(0));
		System.out.println(ls.contains(11));
		ls.set(0, null);
		System.out.println(ls);
		
	}

}
