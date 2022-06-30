package list;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class cursors_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		System.out.println("Enter the array elements ");
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < 7; i++) {
			Integer data = sc.nextInt();
			v.add(data);
		}		
		System.out.println(v);
		
		
		Enumeration e =v.elements();
		while(e.hasMoreElements()) {
			Integer ele = (Integer) e.nextElement();
			if(ele%5==0) {
				System.out.println(ele);
			}
		}
		

	}

}
