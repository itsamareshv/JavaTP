package eNum;

public enum Day {

MONDAY,
TUESDAY,
THURSDAY,
FRIDAY,
SATURDAY{
	@Override
	public String getMessage() {
		return "Weekend";
	}
},
SUNDAY{
	@Override
	public String getMessage() {
		return "Weekend";
	}
};
	public String getMessage() {
		return "WeekDay";
	}
}
