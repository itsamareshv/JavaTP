package StringConcepts;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";
		String s2="Tendulkar";
		
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("Ajay"));
		System.out.println(s1+="Ajay");
		System.out.println("ABCD".compareTo("ABCD"));
		System.out.println("ABCD".compareTo("Abcd"));
		
		
		
		char Small='b';
		char Cap='B';
		System.out.println((Small-Cap));
		
		System.out.println(s1.replace('a', 'A'));
		
		String s4="7676251199";
		System.out.println(s4.substring(10));
		System.out.println(s4.substring(0, 5));
		
		String x="ajay";
		String y ="AJAY";
		System.out.println(x.equalsIgnoreCase(y));
		
		
	}

}
