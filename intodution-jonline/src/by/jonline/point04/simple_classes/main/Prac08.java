package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac08.CustomerArray;
import by.jonline.point04.simple_classes.main.prac08.Customer;

public class Prac08 {

	public static void main(String args[]) {
		
		CustomerArray ca = new CustomerArray();
		ca.add(new Customer(1, 20, 31, "Yevgeniy", "Danshov", 
				"Gennadiyevich", "Street 51"));
		ca.add(new Customer(2, 21, 32, "Isaak", "Alistratov", 
				"Nikolayevich", "Street 20"));
		ca.add(new Customer(3, 22, 33, "Tsezar", "Sukhikh", 
				"Ilyich", "Street 38"));
		ca.add(new Customer(4, 23, 34, "Kozlovsky", "Kozlovsky", 
				"Kozlovsky", "Street 85"));
		ca.add(new Customer(5, 24, 35, "Dionisiy", "Chernyshyov", 
				"Vitalievich", "Street 19"));
		
		Output(ca, "Original: ");
		
		ca.SortCostumers();
		Output(ca, "Sorted: ");
		
		ca = ca.getCustomersIntoBCardRange(22, 25);
		Output(ca, "Customers with bank card "
				+ "range 22 - 25: ");
	}
	
	private static void Output(CustomerArray ca, String text) {
		
		System.out.println(text);
		for(Customer csr : ca) {
			
			System.out.println(csr + "\n");
		}
		System.out.println();
	}
}
