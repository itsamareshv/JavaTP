package codeingchallenge3;
/*
*           Print the table of 12 using for loop.
			Output should be in following format:
			12 X 1 = 12
 */
public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =12,limit=20;
		for(int i=1;i<=20;i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
}
}