/*
 * Question 3:
Write a java program to accept <first name> and <last name> as command-line arguments and
display message to the user:
Hello <first name> <last name>, Welcome to Core Java Development Course For Beginners.
If user enters only first name or last name and not both, treat the user with appropriate message,
such as "Please enter both your first name and last name"

 */

package codingchallenge7;

public class cmdlinearguments_username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==1)
		{
			System.out.println("Please Enter Arguments");
			return;
		}
		String fn=args[0];
		String sc=args[1];
		System.out.println("First Name = "+fn);
		System.out.println("Second Name = "+sc);
		
		System.out.println("Hello " + fn +" "+ sc + ", Welcome to Core Java Development Course For Beginners.");

	}

}
