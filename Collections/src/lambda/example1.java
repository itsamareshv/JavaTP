package lambda;
interface ajay{
	public void sum(int a,int b);
}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ajay z = (a,b)->System.out.println("sum ="+(a+b));
		z.sum(5,5);
		
	}
	
	

}
