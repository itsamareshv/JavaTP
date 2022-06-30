package list;

import java.util.ArrayList;
import java.util.Iterator;

public class testIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(24);
		al.add(36);
		al.add(10);
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i%3==0) 
				System.out.println(i);
				else
					itr.remove();
			}
			
		}

	}


