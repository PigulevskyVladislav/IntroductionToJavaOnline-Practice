package by.jonline.point02.sorting.main;

public class Prac07 {

	public static void main(String argsp[]) {
		
		int[] a = {5, 9, 12, 16, 21, 35, 36, 38, 50, 99};
		int[] b = {1, 10, 11, 13, 15, 26, 28, 32, 33, 34, 42, 73, 102};
		int i_a = 0, i_b = 0;
		
		System.out.println("Original A: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("Original B: ");
		for(int i = 0; i < b.length; i++) {
			
			System.out.print(" " + b[i]);
		}
		System.out.println();
		System.out.println("Final sequence should have the following order: ");
		System.out.print("|");
		while(i_a != a.length || i_b != b.length) {
			
			if(i_a != a.length && i_b != b.length) {
				
				if(a[i_a] < b[i_b]) {
					
					i_a++;
					System.out.print(" a" + i_a + " |");
				} else {
					
					i_b++;
					System.out.print(" b" + i_b + " |");
				}
			} else if (i_a != a.length) {
				
				i_a++;
				System.out.print(" a" + i_a + " |");
			} else {
				
				i_b++;
				System.out.print(" b" + i_b + " |");
			}
		}
		System.out.println();
	}
}
