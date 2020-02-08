package by.jonline.point01.loop.main;

public class Prac03 {

	public static void main(String args[]) {
		
		int counter = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			counter += Math.pow(i, 2);
		}
		System.out.println("Result: " + counter);
	}
}
