package list;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("John");
		link.add("Ajay");
		link.add(2);
		link.add(null);
		
		link.set(0, "Amaresh V");//sets the element at index 0
		//link.clear();//clears the linkedlist
		
		link.add(1,"ok");//replaces the element in that loaction and shift location of other elements in the linkedlist
		link.removeLast();//removes last element in the linkedlist
		link.addFirst("first");
		System.out.println(link);
		
		

	}

}
