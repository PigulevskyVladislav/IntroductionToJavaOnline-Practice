package by.jonline.point04.composition.main.prac01;

public class Word {

	private String word;
	
	public Word(String word) {
		
		this.word = word;
	}
	
	public String getWord() {
		
		return word;
	}
	
	public void setWord(String word) {
		
		this.word = word;
	}
	
	@Override
	public String toString() {
		
		return word;
	}
}
