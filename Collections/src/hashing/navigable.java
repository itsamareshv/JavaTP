package hashing;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigable {

	public static void main(String[] args) {
		NavigableMap<String,Integer> t =new TreeMap<>();
		t.put("ABC", 123);
		t.put("DEF", 456);
		t.put("GHI", 789);
		t.put("JKL", 890);
		t.put("MNO",980);
		t.put("PQR",899);
		t.put("STU",100);
		t.put("WXY", 101);
		
		
		System.out.println(t.ceilingEntry("ABC"));;//return gretaer than are equal to the key
		System.out.println(t.floorKey("DEF"));
		System.out.println(t.higherKey("MNO"));
		System.out.println(t.lowerKey("WXY"));
		System.out.println(t.descendingKeySet());
		System.out.println(t.descendingMap());
		System.out.println(t.navigableKeySet());
		System.out.println(t.size());
		System.out.println(t.replace("WXY", 101, 277));
		System.out.println(t.subMap("ABC", "JKL"));
		System.out.println(t.lowerEntry("100"));
		System.out.println(t);
		
	}

}
