
package controlstatements;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Your Name");
	 String name = sc.nextLine(); 
	 
	 System.out.println("**************************");
	 
	 System.out.println("Enter your marks");
	 
	 
	 int marks = sc.nextInt();
	 System.out.println("**************************");
	 int percentage=((marks*100)/600);
	 
	 System.out.println("Name: = \t"+name);
	 System.out.println("Marks: = \t"+marks);
	 System.out.println("Percentage: = \t"+percentage);
	 System.out.println("**************************");
	 }

	}


