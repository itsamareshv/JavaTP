/*
 * Question 1:
Write nested enhanced for-loop to iterate through following 2-Dimensional array:
char [][] arr = {
{'*'},
{'*', '*'},
{'*', '*', '*'},
{'*', '*', '*', '*'},
{'*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*', '*'},
};
Following output is expected:
*
**
***
****
*****
******
*******
 */
package codingchallenge7;

public class enhancedforloop_for2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] arr = {
				{'*'},
				{'*', '*'},
				{'*', '*', '*'},
				{'*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*', '*', '*'},
				};
		for(char[] rows:arr) {
			for(char x:rows) {
				System.out.print(x+"\t");
			}
			System.out.println("");
		}
	}

}
