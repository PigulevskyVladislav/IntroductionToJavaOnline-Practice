package by.jonline.point04.simple_classes.main.prac08;

public class Customer {

	private int id;
	private int bcard_num;
	private int bacc_num;
	private String fname;
	private String lname;
	private String patronymic;
	private String address;
	
	public Customer(int id, int bcard_num, int bacc_num, String fname, 
			String lname, String patronymic, String address) {
		
		this.id = id;
		this.bcard_num = bcard_num;
		this.bacc_num = bacc_num;
		this.fname = fname;
		this.lname = lname;
		this.patronymic = patronymic;
		this.address = address;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getBankCardNum() {
		
		return bcard_num;
	}

	public int getBankAccNum() {
	
		return bacc_num;
	}

	public String getFirstName() {
	
		return fname;
	}

	public String getLastName() {
	
		return lname;
	}

	public String getPatronymic() {
	
		return patronymic;
	}

	public String getAddress() {
	
		return address;
	}
	
	public void setBankCardNum(int val) {
		
		bcard_num = val;
	}

	public void setBankAccNum(int val) {
	
		bacc_num = val;
	}

	public void setFirstName(String val) {
	
		fname = val;
	}

	public void setLastName(String val) {
	
		lname = val;
	}

	public void setPatronymic(String val) {
	
		patronymic = val;
	}

	public void setAddress(String val) {
		
		address = val;
	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bcard_num + "\n" 
				+ bacc_num + "\n" + fname + "\n" 
				+ lname + "\n" + patronymic + "\n" 
				+ address;
	}
}
