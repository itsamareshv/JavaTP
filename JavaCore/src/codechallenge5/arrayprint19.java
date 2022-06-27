/*
 * Write a Java program to store numbers 1 to 10 in an array using data instantiation.
Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array.
Finally write another for loop to print all the array elements.
You should get following output:
19
38
57
76
95
114
133
152
171
190


 */
package codechallenge5;


public class arrayprint19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,j=19;
		for(i=0;i<a.length;i++)
		{
			a[i]=j;
			j+=19;
		}
		for (i = 0; i < a.length; i++) {
			System.out.println(""+a[i]);
		}

	}

}
