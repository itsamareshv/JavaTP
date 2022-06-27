package extraconcepts;

import java.security.SecureRandom;

public class randomnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rn = new SecureRandom(); 
		int a=rn.nextInt(10);
		System.out.println(a);
		
	}
}
