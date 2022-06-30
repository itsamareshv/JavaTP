package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet();
		ns.add(100);
		ns.add(200);
		ns.add(300);
		ns.add(400);
		ns.add(20000);
		System.out.println("---TRee Set---");
		
		
		
		//methods
	System.out.println("Floor of a number "+ns.floor(222222));
System.out.println(ns.lower(190));
		System.out.println(ns.ceiling(2999999));
		System.out.println(ns.higher(200));
		
		System.out.println(ns.pollFirst());//removes the first element
		
		
		System.out.println(ns.pollLast());
		System.out.println(ns);
		
		
	}

}


