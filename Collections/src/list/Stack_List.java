package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Stack_List {

	public static void main(String[] args) {
	Stack lifo = new Stack();
	
	
	
	ArrayList al = new ArrayList();
	for (int i = 1; i <10; i++) {
		al.add(i*2);
		
	}
	lifo.addAll(al);
	
	lifo.add("Food");
	lifo.add("Jamun");
	lifo.push("Arya");;
	lifo.add("Stish");
	//System.out.println(lifo.pop());;
	
	System.out.println(lifo.get(0));;
	System.out.println(lifo.peek());;
	
	
	//passing collection to stack
	
	
	System.out.println(lifo);
	

	}

}
