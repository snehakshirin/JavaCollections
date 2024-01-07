package list;
import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add("customer1");
		v1.add("customer2");
		v1.add(0,"customer3");
		v1.add("customer4");
		v1.add("customer5");
		v1.add("customer6");
		v1.add("customer7");
		v1.add("customer8");
		v1.add("customer9");
		v1.add("customer10");
		System.out.println("size "+v1.size());
		System.out.println("capacity "+v1.capacity());
		v1.add("customer11");
		
		System.out.println("capacity "+v1.capacity());
		
		Vector v2= new Vector();
		v2.add("customer12");
		v2.add("customer13");
//		v1.addAll(0,v2);
		v1.remove(0);
		v1.remove("customer4");
		v1.removeAll(v2);
		
		
		
		System.out.println(v1.contains("customer10"));
		System.out.println(v1.containsAll(v2));
		System.out.println("capacity "+v1.capacity());
		System.out.println(v1);
		v1.set(0,"customer20");
		System.out.println(v1);
//		v1.setElementAt(v2, 0);
		System.out.println(v1);
		System.out.println("size "+v1.size());
//		v1.setSize(30);
		System.out.println("size "+v1.size());
		System.out.println(v1.indexOf("customer2"));
		System.out.println(v1.lastIndexOf(v2));
		System.out.println(v1.isEmpty());
		System.out.println(v1.lastElement());
		
		System.out.println(v1);
		String str=v1.toString();
		System.out.println(str);
		Object[] arr=v1.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
