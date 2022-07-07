package generics;
class BaseData<T>{}

public class ex2_with_generics<T> extends BaseData<T> implements IData<T>{
	
	private T data;

	public ex2_with_generics(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data is :"+data;
	}
	public static void main(String[] args) {
		ex2_with_generics<Integer> d1= new ex2_with_generics<>(1);
		
		System.out.println(d1.toString());
		
		ex2_with_generics<String> d2= new ex2_with_generics<String>("Ajay");
		System.out.println(d2.toString());
		
		IData<String> d3 = new ex2_with_generics<>("We have implemented Generic Interface");
       System.out.println(d3.toString());
       
       //generic type or generic class
       
       ex2_with_generics<String> d4= new ex2_with_generics<String>("Arya");
       BaseData<String>b1=d4;
       
	}

}
