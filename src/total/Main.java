package total;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Brandstof> brandstofList = new ArrayList<Brandstof>();
		Brandstof p1 = new Brandstof(1,"Euro 95", 1.778);
		Brandstof p2 = new Brandstof(2,"Super 98", 1.844);
		Brandstof p3 = new Brandstof(3,"Diesel", 1.441);
		Brandstof p4 = new Brandstof(4,"LPG", 0.793);
		brandstofList.add(p1);
		brandstofList.add(p2);
		brandstofList.add(p3);
		brandstofList.add(p4);
		
		Calendar bd = Calendar.getInstance();
		bd.set(2012, 4, 1, 12, 0);
		Calendar ed = Calendar.getInstance();
		ed.set(2012, 4, 5, 12, 0);

		Pomp p = Pomp.getInstance();
		p.setbrandstofen(brandstofList);
		
		Betaling t1 = new Betaling(1, "Verkoop aan Scooter");
		t1.addbrandstofTobetaling(p1, 6);
		
		Betaling t2 = new Betaling(2, "Verkoop super en diesel - foutje"); 
		t2.addbrandstofTobetaling(p2, 30);
		t2.addbrandstofTobetaling(p3, 30);
		
		Betaling t3 = new Betaling(3, "Verkoop aan bezine/lpg hybride");
		t3.addbrandstofTobetaling(p4, 200);
		t3.addbrandstofTobetaling(p1, 20);

		p.addBetaling(t1);
		p.addBetaling(t2);
		p.addBetaling(t3);
		System.out.println("Totaal betaling t1: " + t1.getbetalingTotaal() );
		System.out.println("Totaal betaling t2: " + t2.getbetalingTotaal() );
		System.out.println("Totaal betaling t3: " + t3.getbetalingTotaal() );

		System.out.println("BTW betaling t1: " + t1.getbetalingTotaal2() );
		System.out.println("BTW betaling t2: " + t2.getbetalingTotaal2() );
		System.out.println("BTW betaling t3: " + t3.getbetalingTotaal2() );
	}

}
