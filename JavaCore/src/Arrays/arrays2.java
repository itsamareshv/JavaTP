package Arrays;
import java.util.*;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int found = 0;
		char a[]=new char[] {'A','B'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Letter to Search");
		char alp=sc.next().charAt(0);//to read character through scanner
		
//		int a[] = {5,10,15,20,25,30};
		
		for (int i = 0; i < a.length; i++) {
			if(alp==a[i]) {
			 found=1;
			 System.out.println("");
			}
		}
		
		String f = (found==1)? "Element	" +alp+"" : "Element Not found	" +alp;
		System.out.println(f);
		
//		if(found==1) {
//			System.out.println("Element Found	"+ alp);
//		}else {
//			System.out.println("Element Not Found	"+ alp);
//		}
	}
}