package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac07.Triangle;

public class Prac07 {

	public static void main(String args[]) {
		
		System.out.println("Creating triangle: \n"
				+ "[0,0]; [5,8]; [9,3].");
		Triangle t = new Triangle(0, 0, 5, 8, 9, 3);
		System.out.println("Perimeter is " + t.Perimeter());
		System.out.println("Area is " + t.Area());
		
		int[] ipm = t.IntrPointMedians();
		System.out.println("The intersection point of the \n"
				+ "medians of the triangle is [" 
				+ ipm[0]+"," + ipm[1] + "].");
		
	}
}
