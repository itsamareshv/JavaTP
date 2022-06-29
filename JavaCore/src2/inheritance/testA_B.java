package inheritance;

public class testA_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A c = new A();
		c.setAge(30);
		System.out.println(c.getAge());
		System.out.println(c.toString());
		
		B d = new B();
		
		d.setAge(20);
		System.out.println(d.getAge());
		
	}

}
