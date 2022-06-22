package codingchallenge.challenge2;
import java.util.*;
public class question2 {
/*
 * Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

You should use while loop.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the upper limit");
	int n =sc.nextInt();
	int sum=0;
	
	
	while(n>0) {
		sum=sum+n;
		System.out.println(sum);
		n--;
	}
	
System.out.println("Total = "+sum);
	}

}
