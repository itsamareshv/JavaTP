package loopingstatements;

public class forloop {

	public static void main(String[] args) {
		int n=10,i;
		for( i =0;i< n;i++) {
			System.out.println(i);
		}

		
//	    for(;;) {
//			System.out.println("$$$$$$");
//		}
		
		
		for(i=0;i<100;) {
			System.out.println(i++);
		}
		
		
		for(i=0;i<5;i=i+1) {
			System.out.println("Thank You");
		}
	}

}
