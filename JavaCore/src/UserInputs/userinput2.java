package UserInputs;

import java.util.Scanner;

public class userinput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		sc.close();
		if(str.length()!=1) {
			System.out.println("Please enter single character");
			return;
		}
System.out.println(str.charAt(0));
	}

}
