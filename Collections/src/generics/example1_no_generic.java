package generics;

public class example1_no_generic {
	
	private String data;
	
	public example1_no_generic(String data) {
		super();
		this.data = data;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


@Override
public String toString() {
	
	return "data is : "+data;
}

	public static void main(String[] args) {
		example1_no_generic e1 = new example1_no_generic("This is d1");
		System.out.println(e1.toString());
		
		

	}

}
