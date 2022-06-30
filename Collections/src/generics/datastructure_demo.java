package generics;

import java.util.ArrayList;

public class datastructure_demo {

	public static void main(String[] args) {
		String[] strArray = new String[20];
		ds_employee[] empArray = new ds_employee[20];
		strArray[0]="Ajay";
		ArrayList list=new ArrayList(); 
		list.add("Arya");
		list.add("AJAY");
		list.add("Arya");
		list.add(new ds_employee());
		
		
		System.out.println(list.get(3));
		
		System.out.println(list);
		
		

	}

}
