package by.jonline.point03.string_as_sbuilder.main;

public class Prac01 {

	public static void main(String args[]) {
		
		String text = " Today is  a   good    day.     |";
		StringBuilder sb = new StringBuilder(text);
		
		System.out.println("Original: ");
		System.out.println(sb);
		System.out.println("Result: ");
		System.out.println(GetCntOfSpaces(sb));
	}
	
	private static int GetCntOfSpaces(StringBuilder sb) {
		
		int cnt_max = 0;
		int cnt = 0;
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(i < sb.length() - 1 && sb.charAt(i) == ' ') {
				
				cnt = 0;
				while(i < sb.length() && sb.charAt(i) == ' ') {
					
					cnt++;
					i++;
				}
				cnt_max = cnt_max < cnt ? cnt : cnt_max;
			} else if (i == sb.length() - 1 && sb.charAt(i) == ' ') {
				
				cnt = 1;
				cnt_max = cnt_max < cnt ? cnt : cnt_max;
			}
		}
		
		return cnt_max;
	}
}
