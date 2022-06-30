package list;

import java.util.Iterator;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		for (int i = 1; i < 100; i++) {
			if(i%5==0) {
				v.add(i);
			}
			
		}
		
		System.out.println(v);
		
		System.out.println(v.contains(10));;
		System.out.println(v.elementAt(5));
		
	
	}

}
