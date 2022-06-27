/*
 * Question 4:
short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
If score is greater than or equal to 100 but less than 200, it is regarded as a century.
If score is greater than or equal to 200, it is regarded as a double-century
 */
package codechallenge5;

public class cricketarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] a = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };
		int i = 0, half = 0, century = 0, dblcentury = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] >= 50 && a[i] <= 100) {
				half++;
			} else {
				if (a[i] >= 100 && a[i] < 200) {
					century++;
				} else {
					if (a[i] >= 200) {
						dblcentury++;
					}
				}
			}
		}
		System.out.println("Half Century		" + half);
		System.out.println("Century			" + century);
		System.out.println("Double Century		" + dblcentury);
	}

}
