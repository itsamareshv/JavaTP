package controlstatements;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fine=100;
		int hours=2,parkinghours=2;
		
		if(parkinghours>hours) {
			System.out.println("You are parking hours are above the alloted hours \nYour Parking fees \n = "+((parkinghours-hours)*20));
		}else if(parkinghours<=hours)
		{
			System.out.println("Alright,You are parking charges = "+20);
		}

	}

}
