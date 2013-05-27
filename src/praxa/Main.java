package praxa;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		Product p1 = new Product(1,"Hamer", 10.95, 19.0);
		Product p2 = new Product(2,"Spijker", 0.05, 19.0);
		Product p3 = new Product(3,"Broodje", 3.50, 7.0);
		Product p4 = new Product(4,"Hamer 2", 10.95, 19.0);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
		Calendar bd = Calendar.getInstance();
		bd.set(2012, 4, 1, 12, 0);
		Calendar ed = Calendar.getInstance();
		ed.set(2012, 4, 5, 12, 0);
		Aanbieding a1 = new Aanbieding(p1, 8.95, bd, ed );

		Winkel w = Winkel.getInstance();
		w.setProducten(productList);
		w.addAanbieding(a1);
		
		Transactie t1 = new Transactie(1, "Verkoop");
		t1.addProductToTransactie(p1, 2);
		t1.addProductToTransactie(p2, 20);
		
		Transactie t2 = new Transactie(2, "Verkoop"); 
		t2.addProductToTransactie(p1, 3);
		t2.addProductToTransactie(p3, 2);
		
		Transactie t3 = new Transactie(3, "Verkoop");
		t3.addProductToTransactie(p4, 2);
		t3.addProductToTransactie(p2, 20);

		w.addTransaction(t1);
		w.addTransaction(t2);
		w.addTransaction(t3);
		System.out.println("Totaal transactie t1: " + t1.getTransactieTotaal() );
		System.out.println("Totaal transactie t2: " + t2.getTransactieTotaal() );
		System.out.println("Totaal transactie t3: " + t3.getTransactieTotaal() );

		System.out.println("BTW transactie t1: " + t1.getTransactieTotaal2() );
		System.out.println("BTW transactie t2: " + t2.getTransactieTotaal2() );
		System.out.println("BTW transactie t3: " + t3.getTransactieTotaal2() );
	}

}
