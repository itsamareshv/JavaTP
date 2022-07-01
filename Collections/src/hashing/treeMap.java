package hashing;

import java.util.SortedMap;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
	TreeMap tm=new TreeMap();
	
//	SortedMap sm=new TreeMap();
//	TreeMap m2 = new TreeMap(sm);
	tm.put(80, "Basics");
	tm.put(10, "A");
	tm.put(20, "C");
	tm.put(30, "");
System.out.println(tm);
	}

}
