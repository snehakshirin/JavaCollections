package datastructures;

public class Printnumbers {
	static int n=6;
	public static void main(String[] args) {

		
		int i=1;
		printNumbers(i);
		
	}
	
	static void printNumbers(int i) {
		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
		
//		if(i!=n) {
//			System.out.println(i);
//			i++;
//			printNumbers(n);
//		}
		
//		if(n>0) {
//			printNumbers(n-1);
//			System.out.println(n);
//		}
		
		if(i==n) {
			return;
		}
		System.out.println(i);
		
		printNumbers(i+1);
	
		
	}

}
