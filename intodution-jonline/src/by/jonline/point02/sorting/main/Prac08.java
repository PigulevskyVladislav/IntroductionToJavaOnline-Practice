package by.jonline.point02.sorting.main;

public class Prac08 {
	
	public static void main(String args[]) {
		
		int[] numt = {4, 6, 1, 30, 12, 13, 24, 12, 53, 21, 52};
		int[] dent = {2, 5, 3, 8, 4, 7, 9, 5, 7, 9, 10};	
		
		PrintOrigin(numt, dent);
		CutFractions(numt, dent);
		LeadToCmnDent(numt, dent);
		SortNumt(numt);
		PrintFinal(numt, dent);
	}
	
	private static void PrintOrigin(int[] numt, int[] dent) {
		
		System.out.println("Origin: ");
		for(int i = 0; i < numt.length; i++) {
			
			if(numt[i] < 10) {
				
				System.out.print(" ");
			}
			System.out.print(" " + numt[i]);
		}
		System.out.println();
		for(int i = 0; i < numt.length; i++) {
			
			System.out.print(" --");
		}
		System.out.println();
		for(int i = 0; i < dent.length; i++) {
			
			if(dent[i] < 10) {
				
				System.out.print(" ");
			}
			System.out.print(" " + dent[i]);
		}
		System.out.println();
	}
	
	private static void PrintFinal(int[] numt, int[] dent) {
		
		System.out.println("Final: ");
		for(int i = 0; i < numt.length; i++) {
			
			if(numt[i] < 10) {
				
				System.out.print(" ");
			}
			System.out.print(" " + numt[i]);
		}
		System.out.println();
		for(int i = 0; i < numt.length; i++) {
			
			System.out.print(" ---");
			if(numt[i] >= 1000) {
				
				System.out.print("-");
			}
		}
		System.out.println();
		for(int i = 0; i < dent.length; i++) {
			
			if(numt[i] >= 1000) {
				
				System.out.print(" ");
			}
			System.out.print(" " + dent[i]);
		}
		System.out.println();
	}
	
	private static void SortNumt(int[] numt) {
		
		int val;
		for(int i = numt.length + 1; i > 0; i--) {
			
			for(int j = i; j < numt.length; j++) {
				
				if(numt[j] < numt[j - i]) {
					
					val = numt[j];
					numt[j] = numt[j - i];
					numt[j - i] = val;
				}
			}
		}
	}
	
	private static int LeadToCmnDent(int[] numt, int[] dent) {
		
		int[] dent_unic = new int[numt.length];
		int lng_dent_unic = 0, cmn_dent = 1;
		boolean isUnique = true;
		
		dent_unic[0] = dent[0];
		cmn_dent = dent[0];
		lng_dent_unic++;
		for(int i = 1; i < dent.length; i++) {
			
			for(int j = 0; j < lng_dent_unic; j++) {
				
				if(dent[i] == dent_unic[j]) {
					
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				
				cmn_dent *= dent[i];
				dent_unic[lng_dent_unic] = dent[i];
				lng_dent_unic++;
			} else {
				
				isUnique = true;
			}
		}
		for(int i = 0; i < numt.length; i++) {
			
			numt[i] = numt[i] * (cmn_dent / dent[i]);
			dent[i] = cmn_dent;
		}
		
		return cmn_dent;
	}
	
	private static void CutFractions(int[] numt, int[] dent) {
		
		boolean isDivisible = true;
		int lng;
		
		for(int i = 0; i < numt.length; i++) {
			
			if(dent[i] > 1) {
				
				lng = dent[i] < 9 ? dent[i] : 9;
				while(isDivisible && dent[i] > 1) {
					
					for(int j = 2; j <= lng; j++) {
						
						if(dent[i] % j == 0 && numt[i] % j == 0) {
							
							dent[i] /= j;
							numt[i] /= j;
							break;
						} else {
							
							isDivisible = j == lng ? false : true;
						}
					}
				}
				isDivisible = true;
			}
		}
	}
}
