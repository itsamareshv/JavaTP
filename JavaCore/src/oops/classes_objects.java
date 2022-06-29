package oops;

public class classes_objects {
	
	
	public String name;
	public int age;
	
	public void name() {
		System.out.println("Your Name	"+name);
	}
	public void age() {
		System.out.println("Your Age	"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classes_objects a=new classes_objects();
		a.name="Ajay";
		a.age=20;
		a.name();
		a.age();

	}

}
