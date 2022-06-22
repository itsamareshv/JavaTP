/**
 * @author Amaresh
 * 
 */


/*
 * Write a java program for following logic.
    if marks < 60, then print "Fail"
    if marks >= 60 but less than 90 , then print "Pass"
    if marks >= 90, then print "Passed with Distinction"

You are free to use any combination of if - else statements.
You can either use if statements OR if - else statements OR if - else if - else statements.

Extra marks if you can solve using all 3 combinations :)
 */
package codingchallenge;
import java.util.*;
public class Exam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Marks");
		int marks = sc.nextInt();
		
		
		if(marks>=101 || marks<0) {
			System.out.println("Enter Valid Marks");
			
		}else if(marks<60) {
			System.out.println("Fail");
		}else if((marks>=60)&&(marks<90)) {
			System.out.println("Pass");
		}else if((marks>=90)&&(marks<=100)) {
			System.out.println("Distinction");
		}

	}

}
