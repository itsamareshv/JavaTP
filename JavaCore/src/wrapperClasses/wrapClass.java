package wrapperClasses;

public class wrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte c= new Byte((byte)127);
		System.out.println(c);

		 Integer d =new Integer((char)'#');
		 System.out.println(d);
		 
		 Boolean e = new Boolean("0");
		 System.out.println(e);
		 
		 Byte val= c.byteValue();
		 System.out.println(val);
		 
		 Integer val2 = (int) c.byteValue();
		 System.out.println(val2);
		 
		 Long val3 = d.longValue();
		 System.out.println(val3);
		 
		 
	}

}
