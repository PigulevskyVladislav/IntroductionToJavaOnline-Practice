package by.jonline.point04.simple_classes.main.prac10;

import by.jonline.point04.simple_classes.main.prac10.Airline.Day;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class AirlineArray implements Iterable<Airline> {

	private final ArrayList<Airline> airlines;
	
	{
		airlines = new ArrayList<>();
	}
	
	@Override
	public Iterator<Airline> iterator() {
		
		return airlines.iterator();
	}
	
	public void add(Airline al) {
		
		airlines.add(al);
	}
	
	public AirlineArray getAirlinesByDest(String dest) {
		
		AirlineArray result = new AirlineArray();
		
		dest = dest.toLowerCase();
		for(Airline al : airlines) {
			
			if(dest.equals(al.getDestination().toLowerCase())) {
				
				result.add(al);
			}
		}
		
		return result;
	}
	
	public AirlineArray getAirlinesByDaysOfWeek(Day ... days) {
		
		AirlineArray result = new AirlineArray();
		
		for(Airline al : airlines) {
			
			Day[] days_al = al.days_week;
			for(int i = 0; i < days.length; i++) {
				
				for(Day day_al : days_al) {
					
					if(days[i] == day_al) {
						
						result.add(al);
						i = days.length;
						break;
					}
				}
			}
		}
		
		return result;
	}
	
	public AirlineArray getAirlinesByDepartTime(LocalTime time) {
		
		AirlineArray result = new AirlineArray();
		
		for(Airline al : airlines) {
			
			if(al.getDepartureTime().isAfter(time)) {
				
				result.add(al);
			}
		}
		
		return result;
	}
}
