package by.jonline.point04.simple_classes.main.prac08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerArray implements Iterable<Customer> {

	private final ArrayList<Customer> customers = new ArrayList<>();
	
	@Override
    public Iterator<Customer> iterator() {
		
        return customers.iterator();
    }
	
	public void add(Customer ctr) {
		
		customers.add(ctr);
	}
	
	public CustomerArray getCustomersIntoBCardRange(
			int lower_lim, int upper_lim) {
		
		CustomerArray result = new CustomerArray();
		
		for(Customer csr : customers) {
			
			int bcn = csr.getBankCardNum();
			
			if(bcn >= lower_lim && bcn <= upper_lim) {
				
				result.add(csr);
			}
		}
		
		return result;
	}
	
	public void SortCostumers() {
		
		for(int j = 0; j < customers.size() - 1; j++) {
			
			for(int i = 0; i < customers.size() - 1; i++) {
				
				char a = customers.get(i).getFirstName().charAt(0);
				char b = customers.get(i + 1).getFirstName().charAt(0);
				if(ToSwap(a, b)) {
					
					Collections.swap(customers, i, i + 1);
				}
			}
		}
	}
	
	private boolean ToSwap(char a, char b) {
		
		a = Character.toLowerCase(a);
		b = Character.toLowerCase(b);
		return a > b;
	}
}
