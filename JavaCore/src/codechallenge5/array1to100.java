/*
 * Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
1    2    3    4    5    6    7    8    9    10    
11    12    13    14    15    16    17    18    19    20    
21    22    23    24    25    26    27    28    29    30    
.
.
.
991    992    993    994    995    996    997    998    999    1000    


 */
package codechallenge5;

public class array1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[1000];
		int count = 0, j, i;

		for (i = 0; i < 100; i++) {
			for (j = 0; j < 10; j++) {
				count++;
				System.out.print("\t" + count);
			}
			System.out.println("");
		}

	}

}
