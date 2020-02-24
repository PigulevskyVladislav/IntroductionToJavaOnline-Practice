package by.jonline.point02.decomposition.main;

public class Prac08 {

	public static void main(String args[]) {
		
		int  sum;
		int[] d = {23, 12, 52, 10, 32, 10, 53, 11};

		System.out.println("Elements of D: ");
		for(int i = 0; i < d.length; i++) {
			
			System.out.print(" " + d[i]);
		}
		System.out.println();
		sum = ElementSum(d, 0, 2);
		System.out.print("D[1] + D[2] + D[3]= " + sum + "\n");
		sum = ElementSum(d, 2, 4);
		System.out.print("D[3] + D[4] + D[5]= " + sum + "\n");
		sum = ElementSum(d, 3, 5);
		System.out.print("D[4] + D[5] + D[6]= " + sum + "\n");
	}
	
	private static int ElementSum(int[] d, int k, int m) {
		
		int sum = 0;
		
		for(int i = k; i <= m; i++) {
			
			sum += d[i];
		}
		
		return sum;
	}
}
