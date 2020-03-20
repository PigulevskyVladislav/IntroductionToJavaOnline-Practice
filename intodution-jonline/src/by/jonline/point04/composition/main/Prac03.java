package by.jonline.point04.composition.main;

import by.jonline.point04.composition.main.prac03.Area;
import by.jonline.point04.composition.main.prac03.City;
import by.jonline.point04.composition.main.prac03.Region;
import by.jonline.point04.composition.main.prac03.State;

public class Prac03 {

	public static void main(String args[]) {
		
		//Init vars
		Area a1 = new Area("Biggest Minsk area", 175);
		Area a2 = new Area("Smallest Minsk area", 40);
		Area a3 = new Area("Biggest Brest area", 200);
		Area a4 = new Area("Smallest Brest area", 25);
		City c1 = new City("Minsk");
		c1.add(a1);
		c1.add(a2);
		City c2 = new City("Brest");
		c2.add(a3);
		c2.add(a4);
		Region r1 = new Region(c1);
		Region r2 = new Region(c2);
		State s = new State("Belarus", c1);
		s.add(r1);
		s.add(r2);
		
		//Dialog
		System.out.println("There we have 1 state, 2 regions,"
				+ "\n2 cities and 4 areas.");
		System.out.println("The capital of " + s.getName()
				+ " is " + s.getCapital().getName() + ".");
		System.out.println("There are " + s.getRegionCount()
				+ " regions in " + s.getName() + ".");
		System.out.println(s.CenteresOfRegions());
		System.out.println("Area of Belarus is " 
				+ s.getSquare() + ".");
	}
}
