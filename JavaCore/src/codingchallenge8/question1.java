/*
 * Question 1:
Write a program to ask user to enter either Y or N.
User can enter in lower case or upper case.
If user enters Y or y, then display “Welcome!” and terminate the program.
If user enters N or n, then display “Good Bye!” and terminate the program.
If user enters any other character, then display “Please provide correct input.” and ask user to enter
either Y or N.
If user enters more than one character such as yes/no/abc, then display “Please provide only one
character.” and ask user to enter either Y or N.
Program should not be terminated until user provides Y/y/N/n.
NOTE: Provide the solution under “challenge8” package and accept input as character.
Result of two separate executions:
Enter either Y/N: yes
Please provide only one character.
Enter either Y/N: a
Please provide correct input.
Enter either Y/N: y
Welcome!
Enter either Y/N: no
Please provide only one character.
Enter either Y/N: n
Good Bye!
 */

package codingchallenge8;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("please enter Y or N");

			String q = sc.nextLine();
			if (q.length() > 1) {

				System.out.println("Enter Single Character");
				System.out.println("-----------------");
				continue;
			}
			char c = q.charAt(0);

			if ((c != 'y' && c != 'Y') && (c != 'n' && c != 'N')) {
				System.out.println("Please provide correct inputs");
				continue;
			}

			if (c == 'y' || c == 'Y') {
				System.out.println("Welcome!");
				break;
			} else if (c == 'n' || c == 'N') {
				System.out.println("Good Bye!");
				break;
				

			}

		}
	}

}
