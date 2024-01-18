package datastructures;

public class Fibonacchi {

	public static void main(String[] args) {

		System.out.println(fibonacchi(7));
	}

	
	static int fibonacchi(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacchi(n-1) + fibonacchi(n-2);
	} 
}
