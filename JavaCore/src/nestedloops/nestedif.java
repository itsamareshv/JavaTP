package nestedloops;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 1, c = 2;
		if (a == 2)//1
			if (b == 2)//2
				if (c == 2)//3
					System.out.println("All are Equal");
				else//3
					System.out.println("c");
			else//2
				System.out.println("b");
		else//1
			System.out.println("a");
	}
}
