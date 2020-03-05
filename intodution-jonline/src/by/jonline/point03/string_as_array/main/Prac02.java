package by.jonline.point03.string_as_array.main;

public class Prac02 {

	public static void main(String args[]) {
		
		String value = "New word is a good word.";
		
		System.out.println("Original: ");
		System.out.println(value);
		System.out.println("Result: ");
		System.out.println(ChangeWordToLetter(value));
	}
	
	private static String ChangeWordToLetter(String str) {
		
		boolean checkWord = true;
		char[] letter = {'l', 'e', 't', 't', 'e', 'r'};
		char[] word = {'w', 'o', 'r', 'd'};
		char[] ch_str = str.toCharArray();
		int lng = str.length();
		
		for(int i = 0; i < str.length(); i++) {
			
			if(ch_str[i] == 'w') {
				
				if(i + 3 < ch_str.length) {
					
					for(int j = 1; j < word.length; j++) {
						
						if(ch_str[i + j] != word[j]) {
							
							checkWord = false;
							break;
						}
					}
					if(checkWord) {
						
						i += 3;
						lng += 2;
					} else checkWord = true;
					
				} else break;
			}
		}
		
		char[] result = new char[lng];
		int i_res = 0;
		
		for(int i = 0; i < str.length(); i++, i_res++) {
			
			if(ch_str[i] == 'w') {
				
				if(i + 3 < ch_str.length) {
					
					for(int j = 1; j < word.length; j++) {
						
						if(ch_str[i + j] != word[j]) {
							
							checkWord = false;
							break;
						}
					}
					if(checkWord) {
						
						i += 3;
						for(int j = 0; j < letter.length; j++, i_res++) {
							
							result[i_res] = letter[j];
						}
						i_res--;
					} else {
						
						result[i_res] = 'w';
						checkWord = true;
					}
					
				} else break;
				
			} else {
				
				result[i_res] = ch_str[i];
			}
		}
		
		return new String(result);
	}
}
