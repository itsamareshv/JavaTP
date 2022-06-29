package oops;

public class shadowing_variables {
	public static int i = 20;
	int x;
	int y;

	public shadowing_variables(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		System.out.println(shadowing_variables.i);

		for (int i = 0; i < 5; i++) {
			System.out.println(shadowing_variables.i);
		}
		
		shadowing_variables c =new shadowing_variables(10, 20);
		
		
	}

}
