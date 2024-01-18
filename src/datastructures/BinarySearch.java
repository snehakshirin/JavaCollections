package datastructures;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array= {1,2,3,4,5};
		int start=0;
		int end=array.length;
		System.out.println(search(array,4,start,end));
		
	}
	
		
	static int search(int[] array, int element ,int start, int end) {
		
		if (start>end)			
			return -1;
		
		int m= start + (end-start)/2;
		
		if (array[m]==element)
			return m;
		
		if (element<array[m])
			return search(array,element,start,m-1);
		
		return search(array,element,m+1,end);
		
		
	}

}
