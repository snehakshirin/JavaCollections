package datastructures;

public class Recursion {

	public static void main(String[] args) {
		
		
//		for(int i=0;i<5;i++) {
//		msg();
//		}
//		int i=0;
//		while(i!=5){
//			
//			msg();
//			i++;
//		}
		

		msg();
	}
	
		
	static int n=1;
	static void msg() {
		System.out.println("hello world "+ n+ "th time");
		
		if(n!=5) {
		n++;
		msg();
		}
		
		
	}
}
