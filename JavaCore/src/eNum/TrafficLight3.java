package eNum;

public class TrafficLight3 {

	public static void main(String[] args) {
		TrafficLIght2 [] arr= TrafficLIght2.values();
		for (TrafficLIght2 obj : arr) {
			System.out.println(obj.toString()+":"+obj.getDuration()+":"+obj.getMessage());;
		}

	}}
