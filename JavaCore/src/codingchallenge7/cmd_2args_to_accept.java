
/*
 * Question 4:
Write a java program to accept more than 1 digit as command-line arguments and display the
highest digit to the user.
For example, if user passes 9, 14, 0, 23, 98, 2, 45
Output should be: Highest digit is: 98
 */

package codingchallenge7;

public class cmd_2args_to_accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		
		if(args.length<1) {
			System.out.println("Arguments Length Should be Greater than 1");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			int num= Integer.parseInt(args[i]);
			if(num>temp) {
				temp=num;
				
			}
		}
		System.out.println("Largest Digit is "+temp);
	}
	

}
