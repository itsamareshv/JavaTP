package codingchallenge;

import java.util.Scanner;

public class Even_Add_Ternary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=s.nextInt();
		String r = (num%2==0)? "Even" :"Odd";
		System.out.println(r);
	}

}
