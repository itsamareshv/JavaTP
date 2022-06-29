package codingchallenge9;

public class A {
	public String str;
	public double val;
	
	public A() {
		 str="test";
	}
	
	public A(String strValue) {
		str=strValue;
		
	}
	public A(double Dval) {
		val=Dval;
	}
	public A(String strValue ,double Dval) {
		str=strValue;
		val=Dval;
	}
	
	
	public void print() {
		System.out.println("str: "+ str + ",val:"+val);
	}

}
