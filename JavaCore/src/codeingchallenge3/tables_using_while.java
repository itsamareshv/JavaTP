package codeingchallenge3;
/*
 * Print the table of 12 using while loop.
Output should be in following format:
 */
public class tables_using_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,n=12,limit=20;
		while(++i<=limit) {
			System.out.println(n + " X " + i + " = " + (n*i));
			
		}
	}

}
