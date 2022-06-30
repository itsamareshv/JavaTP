package set;

import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet d=new TreeSet(new MySorting());
		for (int i = 1; i < 5; i++) {
			
			
			d.add(i*10);
		}
		System.out.println(d);

	}

}
