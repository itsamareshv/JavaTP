package list;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();//creates size of 10 by default
		
		ArrayList alist =new ArrayList(29);
		
		//ArrayList all=new ArrayList(Collection c);//passing collection to array
		
//		List alist=new ArrayList();
		
		al.add("A");
		al.add(10);
		al.add(2.5);
		al.add(-1);
		al.add("@");
		al.add('a');
		al.add("A");// list allows duplication of objects
		
		al.remove(6);
		System.out.println(al.contains("A"));;
		System.out.println(al.get(0));;
		System.out.println(al);
		
		
		//==================ArrayList of particular datatype
		
		ArrayList<String> slist = new ArrayList<String>();
		ArrayList<Character> clist = new ArrayList<Character>();
		ArrayList<Boolean> blist = new ArrayList<Boolean>();
		clist.add('C');
		slist.add("1");
		blist.add(true);
		
		
		
	}

}
