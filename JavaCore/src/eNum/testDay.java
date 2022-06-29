package eNum;

public class testDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] days= Day.values();
		for (Day d : days) {
			System.out.println(d+"    "+d.getMessage());
		}

	}

}
