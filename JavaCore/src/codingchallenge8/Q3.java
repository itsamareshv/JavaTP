
/*
 * Question 3:
 * 
Write a program that simulates rolling a pair of dice. 
Roll of 1st die will give a number between 1 and 6. 
Roll of 2nd die will also give a number between 1 and 6. 
You can use java.security.SecureRandomclass to get the numbers for both the dice. 
Their sum can be number between 2 and 12. 
At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their 
sum matches with the guessed number then we have a winner. Display greetings and exit the 
program. 
But if their sum doesn’t match, then ask user, if he would like to play again. If his answer is n, then 
exit the program but if his answer is y then re-run the same logic.
Your output should match with below output.
Result of three separate executions:

Guess a number between 2 and 12: 7
To win you have to score 7
Press Enter to roll the dice...
Your score: 9. Sorry you lost, would you like to play again? (y/n): y

Guess a number between 2 and 12: 7
To win you have to score 7
Press Enter to roll the dice...
Congratulations!!!! Collect prize money at the counter.

Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 5. Sorry you lost, would you like to play again? (y/n): n

Guess a number between 2 and 12: 100
Guess a number between 2 and 12: 45
Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 6. Sorry you lost, would you like to play again? (y/n): y
Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 5. Sorry you lost, would you like to play again? (y/n): n

 */
package codingchallenge8;

import java.security.SecureRandom;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rn = new SecureRandom();
String j;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			
			
			
			System.out.println("Guess the sum of two Dice between 2 and 12");
			int s = sc.nextInt();
			if (s < 2 || s > 12) {
				System.out.println("Please guess the numbers correctly");
				continue;
			}
			
			

			int i = 1, r, sum = 0;
			if (i <= 2) {
				r = rn.nextInt(6) + 1;
				System.out.println(i + " st" + " Result = " + r);
				sum += r;
				i++;
			}

			if (sum == s) {
				System.out.println("Congratulations!!!! Collect prize money at the counter." + "Sum = " + sum);
				break;
			} else {
				System.out.println("Your Score = " + sum + " ,Sorry you lost, ");
				
				continue;
		     }
			
			
			
		}
		

		}

	}

//System.out.println("would you like to play again? (y/n):");
//String str= sc.nextLine();
//char c = str.charAt(0);
//if (c == 'y' || c == 'Y') {
//	continue;
//	
//} else if (c == 'n' || c == 'N') {
//	
//	break;
//	
//
//}