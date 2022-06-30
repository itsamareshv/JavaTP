package set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		//TreeSet ts1 =new TreeSet(Comparator c);
		SortedSet s = new TreeSet();
		
		TreeSet s2 = new TreeSet(s);
		
		HashSet hs = new HashSet();
		
		TreeSet hs3=new TreeSet(hs);
		
		
		
		TreeSet<String> ts4 = new TreeSet<String>();
		
		ts4.add("Ajay");
		ts4.add("Amaresh V");
		ts4.add("Abhishek");
		
		System.out.println(ts4);
		
		TreeSet<Float> sal =new TreeSet<Float>();
		
		for (int i = 1; i < 10; i++) {
			float f=(float) (i*17400.60);
			sal.add(f);
			
			
		}
		System.out.println(sal+"\n");
		
		
		//TreeSet<Employee> emp=new TreeSet<Employee>();
		
		
		
		
		
		

	}

}
