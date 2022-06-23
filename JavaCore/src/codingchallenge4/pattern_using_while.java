
/*
 * Print following output using nested while loops:
1
22
333
4444
55555
666666
7777777
 */
package codingchallenge4;

public class pattern_using_while {
	public static void main(String args[]) {
		int i = 1;

		while (i <= 7) {
			int j = 1;
			while (j <= i) {
				System.out.print(i);
				j++;
			}

			System.out.println();
			i++;

		}

	}
}
