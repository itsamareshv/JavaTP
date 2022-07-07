package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j < 5; j++) {
			list.add(j*2);
		}
		System.out.println(list);

		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(Integer i:list) {
			if(i>=5) {
				newList.add(i);
			}
		}
		System.out.println(newList);
		
		//Streams
		//filter
		List<Integer> l1=list.stream().filter(i->i>=2).collect(Collectors.toList());	
		System.out.println(l1);
		
		//map
		
		List<Integer> l2=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
	}

}
