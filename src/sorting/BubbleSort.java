package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		
		//bubble sort compares the adjesent elements 
		int[] a =  new int[] {15,16,6,8,5};
		int temp;
		int n=a.length;
//		System.out.println(n);
		for(int j=1;j<=n-1;j++) {
//			System.out.println(j);
		for(int i=0;i<n-j;i++) {
			
			
			if(a[i]>a[i+1]) {
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
//			System.out.println(a[i]);
			
			
		}
		}
		
	for(int i=0;i<n;i++) {
			
			System.out.println(a[i]);
		

	}
	

}
}
