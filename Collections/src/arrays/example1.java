package arrays;

public class example1 {

	public static void main(String[] args) {

		// Array different Declarations

		// single declaration
		int[] a = new int[10];
		
		

		// 2d declaration
		int[][] twod = new int[2][2];

		/// java object array[]
		Object[] obj = new Object[5];
		System.out.println(obj);// [Ljava.lang.Object;@2626b418
		obj[0] = a;
		System.out.println(obj[0]);// [I@5a07e868
		System.out.println(obj.length);

		System.out.println("---------------------");

		// Number array[]
		Number[] arr3 = { 1, 2, 3, 4 };

		System.out.println(arr3);
		System.out.println(arr3.length);
		System.out.println(arr3[0]);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		
		//Runnable Array[]
		System.out.println("Runnable Array");
		Runnable[] run = new Runnable[10];
		System.out.println(run.getClass());;
		
System.out.println("++++++++++++++++++++++++++++++");
		for (int i = 0; i < a.length; i++) {
			a[i] = 2 * i;
		}
		for (int b : a) {
			System.out.println(b);

		}
		System.out.println("Copied Array");
		int[] A=a;
		for(int l:A) {
			System.out.println(l);
		}
		System.out.println("*********************");

		for (int[] d : twod) {
			for (int e : d) {
				System.out.println(e);
			}
		}

	}

}
//int[]x;
// int[][]y,o;
// int[]k = null,l= {2,4,5,6,7,8,9};

// int[]z= {1,2,3,4,5,6,7,8};