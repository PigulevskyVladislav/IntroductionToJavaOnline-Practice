package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac04.Train;
import java.time.LocalTime;
import java.util.Scanner;

public class Prac04 {

	public static void main(String args[]) {
		
		Train[] trains = new Train[5];
		
		//Trains init
		Train t1 = new Train("Anglesey", 2010, LocalTime.of(12, 50));
		Train t2 = new Train("Chester", 2011, LocalTime.of(05, 13));
		Train t3 = new Train("Basildon", 2012, LocalTime.of(01, 05));
		Train t4 = new Train("Yorkshire", 2013, LocalTime.of(16, 45));
		Train t5 = new Train("Anglesey", 2015, LocalTime.of(21, 30));
		
		//Push trains into an array
		trains[0] = t1;
		trains[1] = t2;
		trains[2] = t3;
		trains[3] = t4;
		trains[4] = t5;
		
		System.out.println("Sorted by number: ");
		trains = SortByNumber(trains);
		PrintTrainsArray(trains);
		
		System.out.println("Sorted by destination: ");
		trains = SortByDestination(trains);
		PrintTrainsArray(trains);
		
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter train number: ");
		try {
			
			num = s.nextInt();
			PrintTrainByNum(trains, num);
			
		} catch(Exception e) {
			
			System.out.println("Invalid input!");
		}
		s.close();
	}
	
	private static Train[] SortByNumber(Train[] trains) {
		
		Train val;
		
		for(int j = 0; j < trains.length - 1; j++) {
			
			for(int i = 0; i < trains.length - 1; i++) {
				
				if(trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
					
					val = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = val;
				}
			}
		}
		
		return trains;
	}
	
	private static Train[] SortByDestination(Train[] trains) {
		
		Train val;
		
		for(int j = 0; j < trains.length - 1; j++) {
			
			for(int i = 0; i < trains.length - 1; i++) {
				
				if(NeedToSwap(trains[i], trains[i + 1])) {
					
					val = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = val;
				}
			}
		}
		
		return trains;
	}
	
	private static boolean NeedToSwap(Train t1, Train t2) {
		
		char fchar_t1 = Character.toLowerCase((t1.getDestination().charAt(0)));
		char fchar_t2 = Character.toLowerCase((t2.getDestination().charAt(0)));
		if(fchar_t1 > fchar_t2) {
			
			return true;
		} else if(fchar_t1 == fchar_t2) {
			
			if(t1.getDepartureTime().isAfter(t2.getDepartureTime())) {
				
				return true;
			}
		}
		
		return false;
	}
	
	private static void PrintTrainsArray(Train[] trains) {
		
		for(Train t : trains) {
			
			System.out.println(t + "\n");
		}
	}
	
	private static void PrintTrainByNum(Train[] trains, int num) {
		
		for(Train t : trains) {
			
			if(t.getTrainNumber() == num) {
				
				System.out.println(t);
				return;
			}
		}
		
		System.out.println("Train not found.");
	}
}
