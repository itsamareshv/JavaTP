package concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class concurrentModificationDemo extends Thread{
	private static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		concurrentModificationDemo child =new concurrentModificationDemo();
		list.add("Ajay");
		list.add("Arya");
		list.add("Akshay");
		list.add("gopi");
		list.add("Naveen");
		list.add("JayP");
		list.add("Shoiab");
		child.run();
		Iterator itr =list.iterator();
		
		while(itr.hasNext()) {
			String name=(String) itr.next();
			System.out.println("Main Thread Iterating -> "+name);
			try {
				Thread.sleep(1000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		

	}
	public void run() {
		try {
			Thread.sleep(100);
		}catch (Exception e) {
			e.printStackTrace();
		}
		list.add("GAnesh");
	}

}
