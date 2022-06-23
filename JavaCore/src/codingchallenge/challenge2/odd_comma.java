package codingchallenge.challenge2;

public class odd_comma {
	/*
	 * Question 4:
Write a program for following logic:
Print all the odd numbers in comma separated form from 1 till end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if - else statements. Note that, there should not be any comma after last digit.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1,end=11,i;
		
		
        while(start<=end) {
        	if(start%2!=0) {
        		System.out.print(start+" ");
        		
        }else if(start%2==0 && start!=end) {
        	System.out.print(",");
        }
        	start++;
        }
        
	}

}
