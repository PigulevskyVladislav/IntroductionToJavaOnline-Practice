package by.jonline.point02.decomposition.main;

public class Prac07 {
	
	public static void main(String args[]) {
		
		int sum;
		
		sum = FactorialRush();
		System.out.println("Result: " + sum);
	}
	
	private static int FactorialRush() {
		
		int sum = 0;
		for(int i = 1; i <= 9; i += 2) {
			
			sum += GetFactorial(i);
		}
		
		return sum;
	}
	
	private static int GetFactorial(int a) {
		
		int fct = 1;
		for(int i = 1; i <= a; i++) {
			
			fct *= i;
		}
		
		return fct;
	}
}
