package by.jonline.point04.composition.main.prac05;

import java.util.Arrays;

public class TravelVoucher {

	private int id;
	private int days_cnt;
	private String food;
	private String transport;
	private Offer[] offers;
	
	public TravelVoucher(int id, int days_cnt, 
			String food, String transport, Offer ... offers) {
		
		this.id = id;
		this.days_cnt = days_cnt;
		this.food = food;
		this.transport = transport;
		this.offers = offers;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getCountOfDays() {
		
		return days_cnt;
	}
	
	public String getFood() {
		
		return food;
	}
	
	public String getTransport() {
		
		return transport;
	}
	
	public Offer[] getOffers() {
		
		return offers;
	}
	
	public void setCountOfDays(int days_cnt) {
		
		this.days_cnt = days_cnt;
	}
	
	public void setFood(String food) {
		
		this.food = food;
	}

	public void setTransport(String transport) {
	
		this.transport = transport;
	}
	
	public void setOffers(Offer ... offers) {
		
		this.offers = offers;
	}
	
	@Override
	public String toString() {
		
		return "TravelVoucher " + id
				+ ":\nCount of days: " + days_cnt
				+ ";\nType of food: " + food
				+ ";\nTransport: " + transport
				+ ";\nOffers: " 
				+ Arrays.toString(offers) + ".";
	}
	
	public enum Offer {
		
		RELAXATION,
		EXCURSION,
		TREATMENT,
		SHOPPING,
		CRUISE
	}
}
