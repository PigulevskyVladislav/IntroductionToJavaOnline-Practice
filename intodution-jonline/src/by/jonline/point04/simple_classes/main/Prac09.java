package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac09.BookArray;
import by.jonline.point04.simple_classes.main.prac09.Book;

public class Prac09 {

	public static void main(String args[]) {
		
		BookArray ba = new BookArray();
		
		Book b1 = new Book(1, 1996, 145, 4.19, "FirstName", "Publish1", "FirstType");
		b1.AddAutor("Pushkin");
		Book b2 = new Book(2, 2016, 342, 9.59, "SecondName", "Publish2", "FirstType");
		b2.AddAutor("Dovidov");
		Book b3 = new Book(3, 2020, 247, 6.29, "ThirdName", "Publish2", "SecondType");
		b3.AddAutor("Pushkin");
		Book b4 = new Book(4, 1999, 119, 5.59, "FourthName", "Publish1", "SecondType");
		b4.AddAutor("Dovidov");
	
		ba.add(b1);
		ba.add(b2);
		ba.add(b3);
		ba.add(b4);
		
		Output(ba, "Original: ");
		Output(ba.getBookAfterYear(2000), 
				"Books that were published after 2000: ");
		Output(ba.getBooksByAutor("pushkin"), 
				"Books that autor is Pushkin: ");
		Output(ba.getBooksByPublish("publish1"), 
				"Books that published by Publish1: ");
	}
	
	private static void Output(BookArray ba, String text) {
		
		System.out.println(text);
		for(Book bk : ba) {
			
			System.out.println(bk + "\n");
		}
		System.out.println();
	}
}
