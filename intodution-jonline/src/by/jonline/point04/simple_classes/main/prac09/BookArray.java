package by.jonline.point04.simple_classes.main.prac09;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArray implements Iterable<Book> {

	private final ArrayList<Book> books = new ArrayList<>();
	
	@Override
	public Iterator<Book> iterator() {
		
		return books.iterator();
	}
	
	public void add(Book book) {
		
		books.add(book);
	}
	
	public int size() {
		
		return books.size();
	}
	
	public BookArray getBooksByAutor(String val) {
		
		BookArray bks = new BookArray();
		
		val = val.toLowerCase();
		for(Book bk : books) {
			
			ArrayList<String> auts = bk.getAutors();
			for(String aut : auts) {
				
				if(aut.toLowerCase().equals(val)) {
					
					bks.add(bk);
					break;
				}
			}
		}
		
		return bks;
	}
	
	public BookArray getBooksByPublish(String val) {
		
		BookArray bks = new BookArray();
		
		val = val.toLowerCase();
		for(Book bk : books) {
			
			if(bk.getPublish().toLowerCase().equals(val)) {
				
				bks.add(bk);
			}
		}
		
		return bks;
	}

	public BookArray getBookAfterYear(int val) {
		
		BookArray bks = new BookArray();
		
		for(Book bk : books) {
			
			if(bk.getYear() > val) {
				
				bks.add(bk);
			}
		}
		
		return bks;
	}
}
