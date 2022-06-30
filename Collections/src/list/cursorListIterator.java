package list;

import java.util.ArrayList;
import java.util.ListIterator;

public class cursorListIterator {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Ajay");
		str.add("Amaresh V");
		str.add("Arya");
		System.out.println(str);
		
		ListIterator li=str.listIterator();
		
		while(li.hasNext())
		{
			String item = (String) li.next();
		System.out.println(item);	
		if(item.equals("Ajay")) {
			li.add("BadBOy");
		}
		if(item.endsWith("V")) {
			li.remove();
		}
		}
		System.out.println(str);

	}

}
