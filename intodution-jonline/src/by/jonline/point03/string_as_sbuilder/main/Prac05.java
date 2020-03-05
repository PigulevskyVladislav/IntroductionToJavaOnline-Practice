package by.jonline.point03.string_as_sbuilder.main;

public class Prac05 {

	public static void main(String args[]) {
		
		String text = "Ах, какой сегодня прекрасный день!";
		StringBuilder sb = new StringBuilder(text);
		int cnt = 0;
		
		System.out.println("Original: " );
		System.out.println(text);
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(Character.toLowerCase(sb.charAt(i)) == 'а') {
				
				cnt++;
			}
		}
		System.out.println("Result: " + cnt);
	}
}
