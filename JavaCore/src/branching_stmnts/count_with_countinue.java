package branching_stmnts;

public class count_with_countinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,count=0;
		outer:
		for(int i=0;i<=500;i++) {
			inner:
			while(i%2==num) {
				count++;
				
				continue outer;
			}
		}System.out.println("Numbe of times  "+count);
	}

}
