package by.jonline.point04.simple_classes.main.prac10;

import java.time.LocalTime;
import java.util.Arrays;

public class Airline {

	String destination;
	String plane_type;
	int flight_num;
	Day[] days_week;
	LocalTime depart_time;
	
	public Airline(String dest, String ptype, int fnum,
			LocalTime time, Day ... days) {
		
		destination = dest;
		plane_type = ptype;
		flight_num = fnum;
		days_week = days;
		depart_time = time;
	}
	
	public String getDestination() {
		
		return destination;
	}
	
	public String getPlaneType() {
		
		return plane_type;
	}
	
	public int getFlightNumber() {
		
		return flight_num;
	}
	
	public Day[] getDaysOfWeek() {
		
		return days_week;
	}
	
	public LocalTime getDepartureTime() {
		
		return depart_time;
	}
	
	public void setDestination(String dest) {
		
		destination = dest;
	}
	
	public void setPlaneType(String ptype) {
		
		plane_type = ptype;
	}
	
	public void setFlightNumber(int fnum) {
		
		flight_num = fnum;
	}

	public void setDaysOfWeek(Day[] days) {
	
		days_week = days;
	}

	public void setDepartureTime(LocalTime time) {
	
		depart_time = time;
	}

	@Override
	public String toString() {
		
		return "Destination: " + destination 
				+ ";\nPlane type: " + plane_type
				+ ";\nFlight number: " + flight_num
				+ ";\nDays of week: " + Arrays.toString(days_week)
				+ ";\nDeparture time: " + depart_time + ".";
	}
	
	public enum Day{
		 
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
	    SUNDAY
	}
}


