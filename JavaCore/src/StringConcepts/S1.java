package StringConcepts;

public class S1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hii";
		String s2="_Bye";
		s1.concat(s2);
		System.out.println("1 "+s1);
		
		String s3="Go";
		String s4="_Away";
		 s3=s3.concat(s4);
		System.out.println(s3);
		
		String s5 = new String("Ajay");
		
		//intern() returns the String that present in the string pool
		String s6 = s3.intern();
		
		System.out.println(s5);
		System.out.println(s6);

	}

}
