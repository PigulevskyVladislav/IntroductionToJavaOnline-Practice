package by.jonline.point04.composition.main.prac01;

import java.util.ArrayList;
import java.util.Iterator;

public class Sentence implements Iterable<Word> {

	private final ArrayList<Word> words;
	private String end_mark;
	
	{
		words = new ArrayList<>();
		end_mark = "";
	}
	
	@Override
	public Iterator<Word> iterator() {
		
		return words.iterator();
	}
	
	private void add(Word word) {
		
		words.add(word);
	}
	
 	public void setEndMark(String emark) {
		
		end_mark = emark;
	}
	
	public void setEndMark(char emark) {
		
		end_mark = Character.toString(emark);
	}
	
	public static Sentence StringToSentence(String str) {
		
		Sentence result = new Sentence();
		
		//Getting the end mark of the sentence
		int i = str.length() - 1;
		do {
			
			i--;
		} while(i != 0 && (str.charAt(i) == '.' 
				|| str.charAt(i) == '!' 
				|| str.charAt(i) == '?'));
		result.setEndMark(str.substring(i + 1));
		str = str.substring(0, i + 1);
		
		//Getting words from str
		String[] words = str.split(" ");
		for(String word : words) {
			
			if(!word.contentEquals("")) {
				
				result.add(new Word(word));
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		if(words.size() == 0) {
			
			return "";
		} else  {
			
			result += words.get(0);
			
			if (words.size() > 1) {
				
				for(int i = 1; i < words.size(); i++) {
					
					result += " " + words.get(i);
				}
			} 
			
			result += end_mark;
		}
			
		return result;
	}
}
