package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac06.TimeType;

public class Prac06 {

	public static void main(String args[]) {
		
		System.out.println("Let's try to create time with the\n"
				+ "following values: "
				+ "\n 2 hours"
				+ "\n 231 minutes"
				+ "\n 59 seconds");
		TimeType tt = new TimeType(2, 231, 59);
		System.out.println("Result: " + tt);
		
		tt.setHours(1);;
		System.out.println("Changing hours to 1 we get: " + tt);
		tt.increaseHours(4);
		System.out.println("Adding 4 hours we get: " + tt);
		tt.increaseMinutes(241);
		System.out.println("Adding 241 minutes we get: " + tt);
		tt.increaseSeconds(370125);
		System.out.println("Adding 370125 seconds we get: " + tt);
	}
}
