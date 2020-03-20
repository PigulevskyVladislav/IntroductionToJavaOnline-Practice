package by.jonline.point04.composition.main.prac04;

public class Client {

	private String full_name;
	private int id;
	
	public Client(int id, String full_name) {
		
		this.id = id;
		this.full_name = full_name;
	}
	
	public String getFullName() {
		
		return full_name;
	}
	
	public int getId() {
		
		return id;
	}
}
