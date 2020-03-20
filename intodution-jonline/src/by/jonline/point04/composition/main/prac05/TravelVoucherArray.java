package by.jonline.point04.composition.main.prac05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TravelVoucherArray implements Iterable<TravelVoucher> {

	private final ArrayList<TravelVoucher> tvouchers;
	
	{
		tvouchers = new ArrayList<>();
	}
	
	@Override
	public Iterator<TravelVoucher> iterator() {
		
		return tvouchers.iterator();
	}
	
	public void add(TravelVoucher tv) {
		
		tvouchers.add(tv);
	}
	
	public TravelVoucherArray GetVouchersByCountOfDays(int count) {
		
		TravelVoucherArray result = new TravelVoucherArray();
		
		for(TravelVoucher tv : tvouchers) {
			
			if(tv.getCountOfDays() == count) {
				
				result.add(tv);
			}
		}
		
		return result;
	}
	
	public TravelVoucherArray GetVouchersByTransport(String transport) {
		
		TravelVoucherArray result = new TravelVoucherArray();
		
		for(TravelVoucher tv : tvouchers) {
			
			if(tv.getTransport().equals(transport)) {
				
				result.add(tv);
			}
		}
		
		return result;
	}
	
	public TravelVoucherArray GetVouchersByFood(String food) {
		
		TravelVoucherArray result = new TravelVoucherArray();
		
		for(TravelVoucher tv : tvouchers) {
			
			if(tv.getFood().equals(food)) {
				
				result.add(tv);
			}
		}
		
		return result;
	}
	
	public void SortByCountOfDays() {
		
		for(int j = 0; j < tvouchers.size() - 1; j++) {
			
			for(int i = 0; i < tvouchers.size() - 1 - j; i++) {
				
				TravelVoucher tv1 = tvouchers.get(i);
				TravelVoucher tv2 = tvouchers.get(i + 1);
				
				if(tv1.getCountOfDays() > tv2.getCountOfDays()) {
					
					Collections.swap(tvouchers, i, i + 1);
				}
			}
		}
	}
}
