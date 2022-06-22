/*
 * Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
Numbers divisible by 2 are even and numbers not divisible by 2 are odd.
 */
package codingchallenge;
import java.util.*;
public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int result=num%2;
		switch(result) {
		case 1:
		
			System.out.println("number is odd");
			break;
	
		case 0:
			System.out.println("Number is Even");
			
		
		}
	}

}
