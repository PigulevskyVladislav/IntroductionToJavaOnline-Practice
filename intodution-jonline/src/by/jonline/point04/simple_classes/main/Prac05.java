package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac05.Counter;

public class Prac05 {

	public static void main(String args[]) {
		
		int min = 4;
		int max = 8;
		Counter ctr = new Counter(false, min, max);
		
		System.out.println("We have counter with a range from 4 to 8");
		System.out.println("By default counter sets the value of minimum.");
		System.out.println("Let's try to increase value of counter 6 times: ");
		for(int i = 0; i < 6; i++) {
			
			ctr.Increase();
			System.out.println("Value is " + ctr.getState());
		}
		System.out.println("Now let's try to generate random value in range\n"
				+ "and reduce it 3 times: ");
		ctr = new Counter(true, min, max);
		for(int i = 0; i < 3; i++) {
			
			ctr.Reduce();
			System.out.println("Value is " + ctr.getState());
		}
	}
}
