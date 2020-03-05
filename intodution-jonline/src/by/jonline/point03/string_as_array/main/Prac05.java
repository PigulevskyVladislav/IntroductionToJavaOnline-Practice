package by.jonline.point03.string_as_array.main;

public class Prac05 {

	public static void main(String args[]) {
		
		String value = "  New   word is a  good word. ";
		
		System.out.println("Original: ");
		System.out.println(value);
		System.out.println("Result: ");
		System.out.println(RemoveExcessSpaces(value));
	}
	
	private static String RemoveExcessSpaces(String str) {
		
		char[] ch_str = str.toCharArray();
		char[] result;
		int pos_secd = str.length() - 1;
		int pos_frst = 0;
		int lng, cnt = 0;
		
		while(ch_str[pos_frst] == ' ') {
			
			pos_frst++;
		}
		while(ch_str[pos_secd] == ' ') {
			
			pos_secd--;
		}
		ch_str = str.substring(pos_frst, ++pos_secd).toCharArray();		
		lng = ch_str.length;
		for(int i = 0; i < ch_str.length; i++) {
			
			while(ch_str[i] == ' ' && ch_str[i + 1] == ' ') {
				
				i++;
				cnt++;
			}
		}
		result = new char[lng - cnt];
		
		int j = 0;
		
		for(int i = 0; i < ch_str.length; i++, j++) {
			
			result[j] = ch_str[i];
			while(ch_str[i] == ' ' && ch_str[i + 1] == ' ') {
				
				i++;
			}
		}
		
		return new String(result);
	}
}
