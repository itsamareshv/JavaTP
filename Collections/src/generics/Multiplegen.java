package generics;

import java.util.ArrayList;

public class Multiplegen {

	public static void main(String[] args) {
		ArrayList<String> ali=new ArrayList<>();
		ali.add("Ajay");
		ali.add("Gopi");
		for (String s : ali) {
			String str=s;
			System.out.println(str);
			
		}
		
		Bin<String,Integer> b=new Bin<>();
		
		

	}

}
