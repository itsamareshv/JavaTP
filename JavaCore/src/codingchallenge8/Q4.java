/*
 * Write a program to accept an int value from the user until user provides 0.
Display the same value in the output.
For non-zero values, re-run the logic.
NOTE: Use of while loop is must in the logic.
One of the results of the execution:
Enter 0 to exit: 100
You entered: 100
Enter 0 to exit: -1
You entered: -1
Enter 0 to exit: 5
You entered: 5
Enter 0 to exit: 0
You entered: 
 */
package codingchallenge8;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter 0 to exit");
			int a= sc.nextInt();
			if(a!=0) {
				System.out.println("You entered "+a);
				System.out.println("------------");
				continue;
			}else {
				System.out.println("You Entered");
				break;
			}
		}

	}

}
