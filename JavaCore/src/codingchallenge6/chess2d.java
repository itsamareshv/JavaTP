
/*
 * Question 1:
Write a java program to create a 2-Dimensional array of 8 * 8 size [to resemble chess board] and
initialize all the array elements starting from 1 till 64 (using for loop) as follows:
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
49 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
Write a nested for loop to print all the elements of 2-Dimensional array in above format.
 */
package codingchallenge6;

public class chess2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int a[][]= new int[8][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				count++;
				System.out.print(count+"\t");
			}
			System.out.println("");
		}
	}

}
