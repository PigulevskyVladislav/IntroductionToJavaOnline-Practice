package by.jonline.point04.composition.main;

import by.jonline.point04.composition.main.prac04.AccountArray;
import by.jonline.point04.composition.main.prac04.Account;
import by.jonline.point04.composition.main.prac04.Client;

public class Prac04 {

	public static void main(String args[]) {
		
		//Create clients
		Client c1 = new Client(1, "Ember Mcfarland");
		Client c2 = new Client(2, "Brooke Fulton");
		Client c3 = new Client(3, "Violet Summers");
		
		//Create accounts
		Account a1 = new Account(1, 500.25, c1);
		Account a2 = new Account(2, 14.25, c1);
		Account a3 = new Account(3, -42.25, c2);
		Account a4 = new Account(4, 1.25, c2);
		Account a5 = new Account(5, -55.25, c3);
		Account a6 = new Account(6, 6.25, c3);
		a2.Block();
		a6.Block();
		
		//Create and fill account array
		AccountArray aa = new AccountArray();
		aa.add(a1);
		aa.add(a2);
		aa.add(a3);
		aa.add(a4);
		aa.add(a5);
		aa.add(a6);
		
		//Dialog
		Output(aa, "Original: ");
		Output(aa.GetAccsByOwner(c2), 
				"Accounts of " + c2.getFullName() + ": ");
		aa.SortByValue();
		Output(aa, "Accounts sorted by value: ");
		System.out.println("Now let's get sum."
				+ "\nBlocked accounts does not match.");
		System.out.println("Sum of values: " + aa.GetSumOfValues());
		System.out.println("Sum of negative values: " + aa.GetSumOfNegValues());
		System.out.println("Sum of positive values: " + aa.GetSumOfPosValues());
	}
	
	private static void Output(AccountArray aa, String text) {
		
		System.out.println(text);
		for(Account acc : aa) {
			
			System.out.println(acc + "\n");
		}
		System.out.println();
	}
}
