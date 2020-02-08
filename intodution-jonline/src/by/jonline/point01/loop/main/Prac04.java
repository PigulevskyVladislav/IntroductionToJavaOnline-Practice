package by.jonline.point01.loop.main;

public class Prac04 {

	public static void main(String args[]) {
		
		long counter = 1;
		
		for (int i = 1; i <= 200; i++) {
			
			counter *= Math.pow(i, 2);
		}
		System.out.println("Result: " + counter);
	}
}
