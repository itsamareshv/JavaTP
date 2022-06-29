package codingchallenge8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter 0 to exit");
			int a= sc.nextInt();
			if(a!=0) {
				System.out.println("You entered "+a);
				System.out.println("------------");
				continue;
			}else {
				System.out.println("You Entered");
				break;
			}
		}while(true);
	}

}
