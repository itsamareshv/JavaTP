package arrays;

public class anonyumus_array {

	public static void main(String[] args) {
		sum(new int[]{1,2,3});

	}

	private static void sum(int[] is) {
		int total=0;
		for(int a:is) {
			total+=a;
		}
		System.out.println(total);
	}

}
