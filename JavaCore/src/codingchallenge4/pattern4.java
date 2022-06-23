
/*
 *  Print following chess board using nested for loops.
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W

NOTE:
1. Total 8 rows and 8 columns.
2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
 */
package codingchallenge4;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 4; j++) {

				if (i % 2 != 0) {
					System.out.print("W" + "\t" + "B" + "\t");
				} else {
					System.out.print("B" + "\t" + "W" + "\t");
				}
			}
			System.out.println("");

		}
	}

}
