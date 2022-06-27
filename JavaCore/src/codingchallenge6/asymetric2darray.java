
/*
 * Question 3:
Following code creates an asymmetrical 2-Dimensional int array:
int [][] numbers = {
{90, 10, 231},
{-20, 80, 100, 23, 54},
{45, 22},
{87, 98, -100, 49, 73, 35, 19}
};
Write logic to find out highest number in above array
 */
package codingchallenge6;

public class asymetric2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int [][] numbers = {
				{90, 10, 231,421},
				{-20, 80, 100, 23, 54},
				{45, 22},
				{87, 98, -100, 49, 73, 35, 19}
				};
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if(numbers[i][j]>temp) {
					temp=numbers[i][j];
				}
				
			}
		}
		System.out.println("Greatest Number in given array "+temp);
	}

}
