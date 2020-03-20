package by.jonline.point04.simple_classes.main.prac09;

import java.util.ArrayList;

public class Book {

	private int id;
	private int year;
	private int page_count;
	private double price;
	private ArrayList<String> autors;
	private String name;
	private String publish;
	private String bind_type;
	
	public Book(int id, int year, int page_count, double price,
			String name, String publish, String bind_type) {
		
		this.id = id;
		this.year = year;
		this.page_count = page_count;
		this.price = price;
		autors = new ArrayList<>();
		this.name = name;
		this.publish = publish;
		this.bind_type = bind_type;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getYear() {
		
		return year;
	}

	public int getPageCount() {
	
		return page_count;
	}

	public double getPrice() {
	
		return price;
	}

	public ArrayList<String> getAutors() {
	
		return autors;
	}

	public String getName() {
		
		return name;
	}	
	
	public String getPublish() {
	
		return publish;
	}	

	public String getBindingType() {
	
		return bind_type;
	}

	public void setYear(int val) {
		
		year = val;
	}

	public void setPageCount(int val) {
	
		page_count = val;
	}

	public void setPrice(double val) {
	
		price = val;
	}

	public void setAutors(ArrayList<String> val) {
	
		autors = val;
	}

	public void setName(String val) {
		
		name = val;
	}	
	
	public void setPublish(String val) {
	
		publish = val;
	}	

	public void setBindingType(String val) {
	
		bind_type = val;
	}
	
	public void AddAutor(String val) {
		
		autors.add(val);
	}
	
	@Override
	public String toString() {
		
		String result = "Id: " + id + "\n" 
				+ "Year: " +  year + "\n" 
				+ "Page count: " +  page_count + "\n" 
				+ "Price: " +  price + "\n";
		
		if(autors.size() != 0) {
			
			result += "Autors:";
			for(int i = 0; i < autors.size(); i++) {
				
				result += " " + autors.get(i);
			}
			result += "\n";
		}
		result += "Published by: " + publish + "\n"
				+ "Binding type: " +  bind_type;
		
		return result; 
	}
}
