package java_exceptions;

public class div_by_zero {
	private int age;
	private int numer;
	private int denom;
	private int res;
	
	public int divide(int numer ,int denom) {
		this.numer=numer;
		this.denom=denom;
		try {
			if(denom!=0) {
				res=numer/denom;
				
			}
		}catch (ArithmeticException e) {
			System.out.println("Cant Divid by Zero");
		}
		return res;
		
		
	}
	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age){
		if(age<0) {
			throw new NegativeArraySizeException();
		}
		
		this.age = age;
	}


	public static void m1() {
		
		int i=0;
		
		try {
			System.out.println(20/i);
		} catch (ArithmeticException e) {
			//System.out.println("Cant be divide by zero");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static void main(String[] args) throws NegativeArraySizeException{
		// TODO Auto-generated method stub
		div_by_zero c = new div_by_zero();
		c.setAge(3);
		c.m1();
		System.out.println(c.divide(10, 0));;
		
	}

}
