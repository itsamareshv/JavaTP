package oops2;

import oops1.student;
public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student c =new student("Ajay",8.0,54);
		c.print();
		c.setAge(90);
		System.out.println(c.getAge());
		if(c.getAge()>50) {
			System.out.println("Your age is above 50");
			System.out.println("You wil die soon RIP");
		}
		
		

	}

}
