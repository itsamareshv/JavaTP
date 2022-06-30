package Queue;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jdgfsjd";
		PriorityQueue pr=new PriorityQueue();
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			pr.add(c);
		}
		System.out.println(pr);
		
		System.out.println(pr.comparator());
		
		

	}

}
