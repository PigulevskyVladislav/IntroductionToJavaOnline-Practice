package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac10.AirlineArray;

import java.time.LocalTime;

import by.jonline.point04.simple_classes.main.prac10.Airline;
import by.jonline.point04.simple_classes.main.prac10.Airline.Day;

public class Prac10 {

	public static void main (String args[]) {
		
		AirlineArray ala = new AirlineArray();
		
		Airline al1 = new Airline("Fargo", "a1", 181, 
				LocalTime.of(14, 30), Day.MONDAY, Day.THURSDAY);
		Airline al2 = new Airline("Minot", "b5", 472, 
				LocalTime.of(06, 15), Day.MONDAY, Day.SATURDAY);
		Airline al3 = new Airline("Indiana", "a8", 351, 
				LocalTime.of(22, 10), Day.FRIDAY, Day.SUNDAY);
		Airline al4 = new Airline("Pierre", "a1", 693, 
				LocalTime.of(15, 40), Day.WEDNESDAY, Day.SATURDAY);
		
		ala.add(al1);
		ala.add(al2);
		ala.add(al3);
		ala.add(al4);
		
		Output(ala, "Original: ");
		Output(ala.getAirlinesByDest("pierre"), 
				"Airlines whose destination is Pierre: ");
		ala = ala.getAirlinesByDaysOfWeek(Day.MONDAY);
		Output(ala, 
				"Airlines on which day of week monday: ");
		Output(ala.getAirlinesByDepartTime(LocalTime.of(10, 00)), 
				"Airlines on which day of week monday "
				+ "and departure time after 10 hours: ");
	}
	
	private static void Output(AirlineArray ala, String text) {
		
		System.out.println(text);
		for(Airline al : ala) {
			
			System.out.println(al + "\n");
		}
		System.out.println();
	}
}
