package by.jonline.point04.simple_classes.main.prac04;

import java.time.LocalTime;

public class Train {

	private String dest;
	private int train_num;
	private LocalTime time;
	
	public Train(String dst, int tr_num, LocalTime t) {
		
		dest = dst;
		train_num = tr_num;
		time = t;
	}
	
	public LocalTime getDepartureTime() {
		
		return time;
	}
	
	public String getDestination() {
		
		return dest;
	}
	
	public int getTrainNumber() {
		
		return train_num;
	}
	
	@Override
	public String toString() {
		
		return "Destination: " + dest 
				+ "\nTrain number: " + train_num
				+ "\nDeparture time: " + time;
	}
}
