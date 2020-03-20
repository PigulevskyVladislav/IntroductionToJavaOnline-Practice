package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac02.Test2;

public class Prac02 {

	public static void main(String args[]) {
		
		Test2 test = new Test2();
		
		System.out.println("First value is equal: " + test.getFirstValue());
		System.out.println("Second value is equal: " + test.getSecondValue());
		
		test.setFirstValue(11);
		test.setSecondValue(15);
		
		System.out.println("Changed first value is equal: " + test.getFirstValue());
		System.out.println("Changed second value is equal: " + test.getSecondValue());
	}
}
