package set;

import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		LinkedHashSet lhs1 = new LinkedHashSet(30);
		
		LinkedHashSet lhs3 =new LinkedHashSet(20,.80f);
		
		//insertion is preserved and combination of linked list and hashtable
		lhs.add("Hii");
		System.out.println(lhs);
	}

}
