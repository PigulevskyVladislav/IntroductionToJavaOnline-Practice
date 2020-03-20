package by.jonline.point04.composition.main.prac04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AccountArray implements Iterable<Account> {

	private final ArrayList<Account> accounts;
	
	{
		accounts = new ArrayList<>();
	}
	
	@Override
	public Iterator<Account> iterator() {
		
		return accounts.iterator();
	}
	
	public void add(Account account) {
		
		accounts.add(account);
	}
	
	public AccountArray GetAccsByOwner(Client owner) {
		
		AccountArray result = new AccountArray();
		int id = owner.getId();
		
		for(Account acc : accounts) {
			
			if(acc.getOwner().getId() == id) {
				
				result.add(acc);
			}
		}
		
		return result;
	}
	
	public AccountArray GetAccsByValue(double value) {
		
		AccountArray result = new AccountArray();
		
		for(Account acc : accounts) {
			
			if(acc.getValue() == value) {
				
				result.add(acc);
			}
		}
		
		return result;
	}
	
	public AccountArray GetAccsByBlock(boolean isBlocked) {
		
		AccountArray result = new AccountArray();
		
		for(Account acc : accounts) {
			
			if(acc.IsBlocked() == isBlocked) {
				
				result.add(acc);
			}
		}
		
		return result;
	}

	public double GetSumOfValues() {
		
		double result = 0;
		
		for(Account acc : accounts) {
			
			result += acc.IsBlocked() ? 0 : acc.getValue();
		}
		
		return result;
	}
	
	public double GetSumOfPosValues() {
		
		double result = 0;
		
		for(Account acc : accounts) {
			
			double value = acc.getValue();
			
			result += (value > 0 && !acc.IsBlocked()) ? value : 0;
		}
		
		return result;
	}
	
	public double GetSumOfNegValues() {
		
		double result = 0;
		
		for(Account acc : accounts) {
			
			double value = acc.getValue();
			
			result += (value < 0 && !acc.IsBlocked()) ? value : 0;
		}
		
		return result;
	}
	
	public void SortById() {
		
		for(int i = 0; i < accounts.size() - 1; i++) {
			
			for(int j = 0; j < accounts.size() - 1; j++) {
				
				if(accounts.get(j).getId() > 
					accounts.get(j + 1).getId()) {
					
					Collections.swap(accounts, j, j + 1);
				}
			}
		}
	}
	
	public void SortByOwnerId() {
		
		for(int i = 0; i < accounts.size() - 1; i++) {
			
			for(int j = 0; j < accounts.size() - 1; j++) {
				
				if(accounts.get(j).getOwner().getId() > 
					accounts.get(j + 1).getOwner().getId()) {
					
					Collections.swap(accounts, j, j + 1);
				}
			}
		}
	}
	
	public void SortByValue() {
		
		for(int i = 0; i < accounts.size() - 1; i++) {
			
			for(int j = 0; j < accounts.size() - 1; j++) {
				
				if(accounts.get(j).getValue() > 
					accounts.get(j + 1).getValue()) {
					
					Collections.swap(accounts, j, j + 1);
				}
			}
		}
	}

	public void SortByBlock() {
		
		for(int i = 0; i < accounts.size() - 1; i++) {
			
			for(int j = 0; j < accounts.size() - 1; j++) {
				
				if(accounts.get(j).IsBlocked() == false && 
					accounts.get(j + 1).IsBlocked() == true) {
					
					Collections.swap(accounts, j, j + 1);
				}
			}
		}
	}
}
