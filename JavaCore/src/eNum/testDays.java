package eNum;

public class testDays {

	public static void main(String[] args) {
//	weekday.valueOf("SUN");
//System.out.println(weekday.valueOf("SUN"));
		weekday[] days = weekday.values();
		for (weekday c : days) {
			System.out.println(c	+"	"+	getMessage(c));
		}
	}
	
	private static String getMessage(weekday d) {
		if(d==null) {
			return "ERROR";
			
		}
		switch(d) {
		
		case MUN:
		case TUS:
		case WED:
		case THU:
		case FRI:
			return "Week Day";
		case SAT:
		case SUN:
			return "WeekeNd";
		default:
			return "ERROR";
			
		}
		
	}

}
