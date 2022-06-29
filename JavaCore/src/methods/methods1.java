package methods;

public class methods1 {
	
	String name,m1,m2,m3;
	int marks1,marks2,marks3;
	
	
	
	public methods1(String Sname,String S1,String S2,String S3,int Sm1,int Sm2,int Sm3) {
		name=Sname;
		m1=S1;
		m2=S2;
		m3=S3;
		marks1=Sm1;
		marks2=Sm2;
		marks3=Sm3;
		
	}
	
	
	public void greetings() {
		System.out.println("Hi Welcome to JAVA "+name);
	}
	
	public int add() {
		int total=marks1+marks2+marks3;
		return total;
	}

	public static String[] convertarray(String S1,String S2,String S3) {
		String arr[]= {S1,S2,S3};
		return arr;
	}
	public static void main(String[] args) {
		methods1 a= new methods1("Amaresh V","Physics","Maths","Chemistry",60,70,80);
		a.greetings();
		int sum=a.add();
		System.out.println("Total Marks "+sum);
		
		String[] arr=methods1.convertarray("Physics", "Maths", "Chemistry");
			for(String s:arr) {
				System.out.println(s);
		}
	}

}
