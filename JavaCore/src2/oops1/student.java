package oops1;

public class student {
	
	String name;
	double percentage;
	int age;
	

	public void setAge(int age) {
		this.age = age;
	}
	public student(String name, double d,int agu) {
		this.name = name;
		this.percentage = d;
		this.age=agu;
		
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.percentage);
	}
	public int getAge(){
		
		return age;
	}


	public static void main(String[] args) {
		

	}

}
