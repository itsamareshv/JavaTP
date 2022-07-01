package hashing;

import java.util.HashMap;

public class weakHashMap {

	public static void main(String[] args) throws InterruptedException {
		HashMap hm=new HashMap();
		Temp t = new Temp();
		
		hm.put(t,"Hii");
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(hm);
		

	}

}
