/**
 * if marks < 60, then print "Fail"
    if marks >= 60 but less than 90 , then print "Pass"
    if marks >= 90, then print "Passed with Distinction"

You are free to use any combination of if - else statements.
You can either use if statements OR if - else statements OR if - else if - else statements.
 */

package codingchallenge;

import java.util.Scanner;

public class exam_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Marks");
		int marks = sc.nextInt();
		
		String s = (marks>=60)?(marks>=90)? "Distinction":"Pass":"Fail";
		System.out.println(s);

	}

}
