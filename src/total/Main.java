package total;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Brandstof> brandstofList = new ArrayList<Brandstof>();
		Brandstof brandstof1 = new Brandstof(1,"Euro 95", 1.778);
		Brandstof brandstof2 = new Brandstof(2,"Super 98", 1.844);
		Brandstof brandstof3 = new Brandstof(3,"Diesel", 1.441);
		Brandstof brandstof4 = new Brandstof(4,"LPG", 0.793);
		brandstofList.add(brandstof1);
		brandstofList.add(brandstof2);
		brandstofList.add(brandstof3);
		brandstofList.add(brandstof4);
		
		Calendar beginDatum = Calendar.getInstance();
		beginDatum.set(2012, 4, 1, 12, 0);
		Calendar eindDatum = Calendar.getInstance();
		eindDatum.set(2012, 4, 5, 12, 0);

		BenzinePomp benzinePomp = BenzinePomp.getBenzinePomp();
		benzinePomp.setBrandstofen(brandstofList);
		
		Betaling betaling1 = new Betaling(1, "Verkoop aan Scooter");
		betaling1.addBetalingsRegel(brandstof1, 6);
		
		Betaling betaling2 = new Betaling(2, "Verkoop super en diesel - foutje"); 
		betaling2.addBetalingsRegel(brandstof2, 30);
		betaling2.addBetalingsRegel(brandstof3, 30);
		
		Betaling betaling3 = new Betaling(3, "Verkoop aan bezine/lpg hybride");
		betaling3.addBetalingsRegel(brandstof4, 200);
		betaling3.addBetalingsRegel(brandstof1, 20);

		benzinePomp.addBetaling(betaling1);
		benzinePomp.addBetaling(betaling2);
		benzinePomp.addBetaling(betaling3);
		System.out.println("Totaal betaling t1: " + betaling1.getTotaalPrijsExBTW() );
		System.out.println("Totaal betaling t2: " + betaling2.getTotaalPrijsExBTW() );
		System.out.println("Totaal betaling t3: " + betaling3.getTotaalPrijsExBTW() );

		System.out.println("BTW betaling t1: " + betaling1.getBTW() );
		System.out.println("BTW betaling t2: " + betaling2.getBTW() );
		System.out.println("BTW betaling t3: " + betaling3.getBTW() );
	}

}
