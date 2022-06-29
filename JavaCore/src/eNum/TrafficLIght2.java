package eNum;

public enum TrafficLIght2 {
	RED(50,"STOP"),AMBER(20,"SLOW"),GREEN(60,"GO");
	
	private int duration;
	String message;
	

	private TrafficLIght2(int duration,String message) {
		this.duration = duration;
		this.message=message;
	}

	int getDuration() {
		// TODO Auto-generated method stub
		return duration;
	}
	
	
	public String getMessage() {
		return message;
		
	}
	//enums provides constructor also
	

		
	}
	


