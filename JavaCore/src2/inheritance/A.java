package inheritance;

public class A extends Object{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		String str="Age	"+this.age+"	bye";
		return str;
	}

}
