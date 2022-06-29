package StringConcepts;

import java.util.Iterator;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder c = new StringBuilder("A");
		for (int i = 0; i < 5; i++) {
			c.append(i*2);
		}
		
		while(c.length()>5) {
			c.deleteCharAt(5);
		}
		
		c.insert(2, 26);//inserts charcter to string
		
		c.reverse();
		System.out.println(c);
		
		
		System.out.println();
		StringBuilder d= new StringBuilder("B");
		System.out.println(d.append("C").reverse().deleteCharAt(1));;

	}

}
