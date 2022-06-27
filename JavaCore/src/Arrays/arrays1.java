package Arrays;
import java.util.*;
public class arrays1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[2];
		
		int average,a,res = 0;
	 
		for(int i=0;i<=A.length-1;i++) {
			
			System.out.println("Enter Marks");
			A[i]=sc.nextInt();
			
		}
		
		for(int i = 0; i<=A.length-1;i++) {
			res =res+A[i];
			
		}
		average=res/A.length;
		System.out.println(res);
		System.out.println("Average is = "+average);
		for(int i=0;i<=A.length-1;i++) {
			System.out.println(A[i]);
			
		}
		
	}
}
