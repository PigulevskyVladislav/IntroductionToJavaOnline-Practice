package by.jonline.point01.branch.main;

import java.util.Scanner;

public class prac01 {

	public static void main(String args[]) {
		
		int a1, a2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter degree of first angle: ");
		a1 = s.nextInt();
		System.out.println("Enter degree of second angle: ");
		a2 = s.nextInt();
		s.close();
		
		if(a1 + a2 >= 360) {
			
			System.out.println("Triangle is not exist");
		} else if(a1 == 90 || a2 == 90 || 360 - a1 - a2 == 90) {
			
			System.out.println("Triangle is right");
		} else {
			
			System.out.println("Triangle isn't right");
		}
	}
}
