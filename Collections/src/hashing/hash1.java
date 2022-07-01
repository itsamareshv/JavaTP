package hashing;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class hash1 {

	public static void main(String[] args) {
		//HashMap map=new HashMap();//initial size =16
		
		//HashMap map=new HashMap(20);//Assigning size of 20
		//HashMap map=new HashMap(20,.90f);//load factor of 90%
		//HashMap map=new HashMap(m);//passing map m
		
		Map m= new HashMap();
		HashMap<String,Integer> marks =new HashMap<>(5);
		
		marks.put("Science", 81);
		marks.put("Maths", 90);
		marks.put("Chemistry", 50);
		marks.put("Science", 67);
		System.out.println(marks.entrySet());
		System.out.println(marks.get("Maths"));
		System.out.println(marks.remove("Maths"));
		System.out.println(marks.replace("Maths", 90, 20));
		System.out.println(marks);
		
		
		IdentityHashMap<Integer,String> ihm =new IdentityHashMap();
		HashMap<Integer,String> hm =new HashMap<>();
		Integer  a =new Integer(10);
		Integer b=new Integer(10);
		
		ihm.put(10, "Ajay");
		ihm.put(a, "Arya");//values can be same but references should be different
		ihm.put(b, "Arya");
		
		hm.put(10, "Ajay");
		hm.put(a, "Arya");//values can be same but references should be different
		hm.put(b, "Arya");
		
		System.out.println(ihm);
		System.out.println(hm);

		
		
		
		
		
		
		

	}

}
