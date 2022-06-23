package branching_stmnts;

public class breakS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
		for(int i=1;i<=100;i++) {
			inner:
			for(int j = 1;j<=10;j++) {
				
				
				System.out.print(i*j+"\t");
				if(i*j==24) {
					break outer;
					}
				
			}
			System.out.println("");
			
		}

	}

}
