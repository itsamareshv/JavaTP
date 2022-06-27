package Arrays;

public class arrays5 {
	public static void main(String args[]) {
		int a[]= new int[5];
		int i,j=10;
		
		
//		Initialization of array using for loop
//		for(i=0;i<a.length;i++) {
//			a[i]=j;
//			j+=10;
//		}
//		
		
//		OR
		for(i=0,j=20;i<a.length;i++,j+=20) {
			a[i]=j;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
