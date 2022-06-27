/*
 * In mathematics, the Fibonacci series are the numbers in the following integer sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
and each subsequent number is the sum of the previous two.

Write a Java Program to generate above series till n number of times (For example you can try with
n = 10 and n = 15) and store it in One-dimensional array.
For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

Write a for loop to print all the elements of the array.
 */
package codechallenge5;


public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[100];
		int i,n=10;;
		a[0]=0;
		a[1]=1;
		for(i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
			
			
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
