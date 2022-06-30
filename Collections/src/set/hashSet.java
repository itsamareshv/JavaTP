package set;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();//Default Size =16
		
		HashSet hs1 = new HashSet(20,.80f);//Default Load is 80%
		
		
		hs.add("Ajay");
		
		
		System.out.println();
		
		System.out.println(hs);

	}

}
