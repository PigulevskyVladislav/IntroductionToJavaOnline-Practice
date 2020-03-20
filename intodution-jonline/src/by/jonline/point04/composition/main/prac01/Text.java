package by.jonline.point04.composition.main.prac01;

import java.util.ArrayList;
import java.util.Iterator;

public class Text implements Iterable<Sentence> {

	private final ArrayList<Sentence> sentenses;
	private String title;
	
	{
		sentenses = new ArrayList<>();
		title = "";
	}
	
	public Text(String title, String str) {
		
		this.title = title;
		AddText(str);
	}
	
	@Override
	public Iterator<Sentence> iterator() {
		
		return sentenses.iterator();
	}
	
	private void add(Sentence sentn) {
		
		sentenses.add(sentn);
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public String getText() {
		
		if(sentenses.size() != 0) {
			
			String result = sentenses.get(0).toString();
			for(int i = 1; i < sentenses.size(); i++) {
				
				result += " " + sentenses.get(i);
			}
			
			return result;
		} else {
			
			return "";
		}
	}
	
	public void AddText(String str) {
		
		String[] sentns = str.split("(?<=([\\!\\?\\.]++))");
		for(String sentn : sentns) {
			
			this.add(Sentence.StringToSentence(sentn));
		}
	}
	
	@Override
	public String toString() {
		
		return "\t" + title + "\n" + getText();
	}
}
