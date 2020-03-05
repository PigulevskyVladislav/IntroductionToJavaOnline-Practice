package by.jonline.point03.string_as_sbuilder.main;

public class Prac10 {

	public static void main(String args[]) {
		
		String x = " Бабочка из семейства белянок!\n"
				+ " Крылья белые, с несколькими чёрными пятнами.\n"
				+ " Любит ли она капусту?\n";
		StringBuilder sb = new StringBuilder(x);
		boolean begin = false, end = false;
		int cnt = 0;
		
		System.out.println("Original: ");
		System.out.println(x);
		
		for(int i = 0; i < sb.length(); i++) {
			
			if((sb.charAt(i) == '.' || sb.charAt(i) == '!'
					|| sb.charAt(i) == '?') && !end) {
				
				begin = true;
			} else if (begin){
				
				end = true;
			}
			if(begin && end) {
				
				cnt++;
				begin = end = false;
			}
		}
		System.out.println("Result: " + cnt);
	}
}
