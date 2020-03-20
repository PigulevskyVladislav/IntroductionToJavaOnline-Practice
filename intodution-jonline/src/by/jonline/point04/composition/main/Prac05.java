package by.jonline.point04.composition.main;

import by.jonline.point04.composition.main.prac05.TravelVoucherArray;
import by.jonline.point04.composition.main.prac05.TravelVoucher;
import by.jonline.point04.composition.main.prac05.TravelVoucher.Offer;

public class Prac05 {

	public static void main(String args[]) {
		
		//Init some travel vouchers
		TravelVoucher tv1 = new TravelVoucher(1, 21, 
				"FirstClass", "Rail", Offer.SHOPPING, Offer.EXCURSION);
		TravelVoucher tv2 = new TravelVoucher(2, 31, 
				"Vegan", "Water", Offer.CRUISE, Offer.EXCURSION);
		TravelVoucher tv3 = new TravelVoucher(3, 18, 
				"ThirdClass", "Air", Offer.TREATMENT, Offer.RELAXATION);
		TravelVoucher tv4 = new TravelVoucher(4, 7, 
				"SecondClass", "Rail", Offer.RELAXATION);
		TravelVoucher tv5 = new TravelVoucher(5, 14, 
				"FirstClass", "Air", Offer.TREATMENT);
		
		//Init and fill array
		TravelVoucherArray tva = new TravelVoucherArray();
		
		tva.add(tv1);
		tva.add(tv2);
		tva.add(tv3);
		tva.add(tv4);
		tva.add(tv5);
		
		//Dialog
		Output(tva, "There we have 5 travel vouchers:");
		tva.SortByCountOfDays();
		Output(tva, "Travel vouchers sorted by count of days:");
		Output(tva.GetVouchersByTransport("Rail"), "Travel vouchers for rail:");
	}
	
	private static void Output(TravelVoucherArray tva, String text) {
		
		System.out.println(text);
		for(TravelVoucher tv : tva) {
			
			System.out.println(tv + "\n");
		}
		System.out.println();
	}
}
