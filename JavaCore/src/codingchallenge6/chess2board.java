
/*
 * Question 2:
Write a java program to create following 2-Dimensional array of 8 * 8 size [to resemble chess board]
using Data instantiation:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
Write a nested for loop to print all the elements of 2-Dimensional array in above format.
 */
package codingchallenge6;

public class chess2board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][] = new char[8][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a.length/2; j++) {
				if(i%2==0) {
					System.out.print(" W "+" B ");
				}else {
					System.out.print(" B "+" W ");
				}
				
				
			}
			System.out.println("");
		}
	}

}
