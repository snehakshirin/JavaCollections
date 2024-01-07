package list;

import java.util.Stack;
import java.util.Vector;

public class StackPractice {

	public static void main(String[] args) {

		Stack<String> st= new Stack<>();
		st.add("first element");
		st.add("second element");
		st.add("third element");
		st.add(0, "0th index");
		System.out.println(st.pop());
		System.out.println(st.push("fourth element"));
		System.out.println(st);

		System.out.println(st.indexOf("fourth element"));
		System.out.println(st.search("fourth element"));
		System.out.println(st.peek());
	
		
	}

}
