package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac01.Test1;

public class Prac01 {

	public static void main(String args[]) {
		
		Test1 test = new Test1();
		
		test.SetFirstVal(12);
		test.SetSecondVal(19);
		test.PrintVals();
		System.out.println("Sum of values: " + test.GetSum());
		System.out.println("Max value: " + test.GetMax());
	}
}
