
/*
 * Question 6:
Below is the code snippet:
package challenge8;
import java.util.Scanner;
public class Ques06 {
public static void main(String[] args) {
String [] indianCricketers = {
"Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag", 
"Rahane", "Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit",
"Dinesh", "Harbhajan", "Ishant" };
//TODO: Type your logic here
}
}
String array “indianCricketers” stores the names of some to the indian cricketers.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
Complete this code to search for particular name. This search should be case-insensitive.
If you search for Sourav/sourav/SOURAV, then you should get following output:
SOURAV found at index: 2 and program should terminate.
NOTE: Name should be in upper case in the message, even though your search string is in any case.
If name is not found in the list, the display following:
AKASH not found in the list. Would you like to search another name? (1 to continue): 
If user’s input is 1, then re-run the logic, otherwise terminate the program.


On execution you should get following output:
Result of three separate executions:
Enter the indian cricketer's name you want to search for: virat
VIRAT found at index: 9
Enter the indian cricketer's name you want to search for: kambli
KAMBLI not found in the list. Would you like to search another name? (1 to continue): 1
Enter the indian cricketer's name you want to search for: Akash
AKASH not found in the list. Would you like to search another name? (1 to continue): 1
Enter the indian cricketer's name you want to search for: SOURAV
SOURAV found at index: 2
Enter the indian cricketer's name you want to search for: Robin
ROBIN not found in the list. Would you like to search another name? (1 to continue): 
 */
package codingchallenge8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] indianCricketers = { "Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag", "Rahane",
				"Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit", "Dinesh", "Harbhajan", "Ishant" };
		
		Scanner sc = new Scanner(System.in);
		String ans;
		doloop:
		do{
		System.out.println("Enter the indian cricketer's name you want to search for: ");
		String search = sc.nextLine();
		
		
			
			for (int i = 0; i < indianCricketers.length; i++) {

				if (search.equalsIgnoreCase(indianCricketers[i])) {
					System.out.println(indianCricketers[i] + " found at index: " + i);
					
					break doloop;
				}
			}
			
				System.out.println("Not Found, Would you like to search another name? (1 to continue):");
				
				ans = sc.nextLine();
		}while(ans.equals(1));
		sc.close();
	
	
			
			
			


	}
}
