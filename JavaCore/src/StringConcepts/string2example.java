package StringConcepts;


public class string2example {
	
	public static boolean checkString(String s1,String s2) {
		//return s1==s2;//false for this
		return s1.equals(s2);
		
	}

	public static void main(String[] args) {
		String s1="A";
		String s2 = new String("A");
		System.out.println(string2example.checkString(s1, s2));
		

	}

}
