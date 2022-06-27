
/*
 * Question 4:
Following code creates an asymmetrical 2-Dimensional int array:
int [][] arr = {
{9, 76, 17, 39},
{8, 87},
{16, 99, 231},
{187}
};
Write logic to store all the array elements of 2-Dimensional array to 1-Dimensional array.
You should have following 1-D array:
9 76 17 39 8 87 16 99 231 187
Finally write code to print all the elements of above One-Dimensional array.
 */
package codingchallenge6;

public class twodtooned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[][] arr = { { 9, 76, 17, 39 }, { 8, 87 }, { 16, 99, 231 }, { 187 } };
		int a[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				a[i] = arr[i][j];
				System.out.println(a[i]);
			}

		}
	}

}
