package by.jonline.point04.composition.main.prac04;

public class Account {

	private int id;
	private double value;
	private Client owner;
	private boolean isBlocked;
	
	public Account(int id, double value, Client owner) {
		
		this.id = id;
		this.value = value;
		this.owner = owner;
		isBlocked = false;
	}
	
	public int getId() {
		
		return id;
	}
	
	public double getValue() {
		
		return value;
	}
	
	public Client getOwner() {
		
		return owner;
	}
	
	public boolean IsBlocked() {
		
		return isBlocked;
	}
	
	public void Block() {
		
		isBlocked = true;
	}
	
	public void Unlock() {
		
		isBlocked = false;
	}
	
	public void setValue(double value) {
		
		this.value = value;
	}
	
	public void ChangeValue(double value) {
		
		this.value += value;
	}
	
	@Override
	public String toString() {
		
		return "Account " + id + ": " 
				+ "\nValue: " + value
				+ ";\nOwner: " + owner.getFullName()
				+ ";\nBlocked: " 
				+ isBlocked + ".";
	}
}
