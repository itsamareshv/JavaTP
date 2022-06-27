package Arrays;

public class twodarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "A", "M", "A", "R", "E" };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		String b[][] = { { "1", "Monday" }, { "2", "Tuesday" }, { "3", "Wednesday" }, { "4", "Thursday" },
				{ "5", "Friday" }, { "6", "Saturday" } };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
