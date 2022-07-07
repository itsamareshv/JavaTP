package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example2 {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for (int j = 1; j < 10; j++) {
			ar1.add(j*2);
		}

		System.out.println(ar1);
		
		//to map elements
		List<Integer> l2 = ar1.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(l2);
		
		//to filter in give
		List<Integer> l3 = ar1.stream().filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(l3);
		
		
		//count
		long cnt = ar1.stream().filter(i->i%2==0).count();
		System.out.println(cnt);
		
		//default sorting
		
		List<Integer> l4=ar1.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		
		//custom sorting 
		List<Integer> l5 = ar1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l5);

	}

}
