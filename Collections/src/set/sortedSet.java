package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {

	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		ss.add(5);
		ss.add(10);
		ss.add(15);
		ss.add(1);
		ss.add(20);
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(10));//elements cmg before 10
		System.out.println(ss.tailSet(5));//returns elements after 5 including 5
		System.out.println(ss.subSet(5,20));
		

	}

}




//
//SortedSet str=new TreeSet();
//ss.add("Amaresh");
//ss.add("Abhishek");
//ss.add("Arya");
//ss.add("Satish");
//ss.add("Swarna");
//ss.add("Swara");
//
//System.out.println(str.toString());