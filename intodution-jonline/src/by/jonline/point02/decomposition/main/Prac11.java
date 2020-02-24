package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac11 {

	public static void main(String args[]) {
		
		int n1, n2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		n1 = s.nextInt();
		System.out.println("Enter first second:");
		n2 = s.nextInt();
		s.close();
		
		switch(IsFrstNumLonger(n1, n2)) {
			
		case(1): 
			System.out.println("The first number is longer.");
			break;
		case(-1):
			System.out.println("The second number is longer.");
			break;
		case(0):
			System.out.println("Length of the numbers is equal.");
			break;
		}
	}
	
	private static int IsFrstNumLonger(int n1, int n2) {
		
		int l1, l2;
		
		l1 = Integer.toString(n1).length();
		l2 = Integer.toString(n2).length();
		
		if(l1 > l2) {
			
			return 1;
		} else if(l1 < l2) {
			
			return -1;
		} else {
			
			return 0;
		}
	}
}
