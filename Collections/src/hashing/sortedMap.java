package hashing;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;



public class sortedMap {

	public static void main(String[] args) {
		SortedMap<Integer,String> sm= new TreeMap<Integer, String>();
		
		sm.put(1, "Ajay");
		sm.put(2, "JayDeep");
		sm.put(3, "Gopal");
		sm.put(4, "Shwetha");
		
		System.out.println(sm);
		Set s = sm.entrySet();
		Iterator j= s.iterator();
		
		

	}

}
