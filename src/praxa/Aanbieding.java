package praxa;

import java.util.Calendar;

public class Aanbieding {
	private Product product;
	private double prijs;
	private Calendar datum1;
	private Calendar datum2;

	public Aanbieding(Product product, double prijs, Calendar datum1,
			Calendar datum2) {
		this.product = product;
		this.prijs = prijs;
		this.datum1 = datum1;
		this.datum2 = datum2;
	}

	public Product getProduct() {
		return product;
	}

	public double getPrijs() {
		return prijs;
	}

	public Calendar getBeginDatum() {
		return datum1;
	}

	public Calendar getEindDatum() {
		return datum2;
	}
	
	public double getAanbiedingPrijs( Product p, Calendar datum ) {
		double prijs = p.getPR();
//		prijs = p.getPrijs();
		if ( p.getGetal() == product.getGetal() &&
				datum.after(datum1) &&
				datum.before(datum2)) {
			prijs = getPrijs();
		}
		
		return prijs;
	}
}
