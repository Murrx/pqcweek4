package praxa;

import java.util.Calendar;
import java.util.Iterator;

public class Transactie {
	private int transactieNr;
	private String transactieType;
	private Calendar datum;
	private double som1;
	private double som2;
	private TransactieRegel[] transactieRegels;
	
	public Transactie(int transactieNr, String transactieType) {
		this.transactieNr = transactieNr;
		this.transactieType = transactieType;
		this.datum = Calendar.getInstance();
		this.som1 = 0.0;
		this.som2 = 0.0;
		this.transactieRegels = new TransactieRegel[100];
	}

	public void addProductToTransactie( Product p, int aantal){
		// eerst controleren hoeveel transactieregels er al zijn
		int aantalBestaandeRegels = 0;
		for (int i = 1; i < transactieRegels.length; i++) {
			if (transactieRegels[i] != null) {
				aantalBestaandeRegels++;
			}
		}
		TransactieRegel tr = new TransactieRegel(p, aantal);
		transactieRegels[aantalBestaandeRegels] = tr;
	}
	
	public double getTransactieTotaal() {
		double result = 0.0;
		for (int i = 0; i < transactieRegels.length; i++) {
			if (transactieRegels[i] != null) {
				Product p = transactieRegels[i].getProduct();
				double prijs = p.getPR();
				// nu door alle aanbiedingen lopen en kijken of er een voor het product bijzit
				for (Iterator iterator = Winkel.getInstance().getAanbiedingen().iterator(); iterator
						.hasNext();) {
					Aanbieding aanbieding = (Aanbieding) iterator.next();
					prijs = aanbieding.getAanbiedingPrijs(p, datum);
				}
				result += prijs * transactieRegels[i].getAantal();
			}
		}
		
		return result;
	}

	public double getTransactieTotaal2() {
		double result = 0.0;
		for (int i = 0; i < transactieRegels.length; i++) {
			if (transactieRegels[i] != null) {
				Product p = transactieRegels[i].getProduct();
				double prijs = p.getPR();
				// nu door alle aanbiedingen lopen en kijken of er een voor het product bijzit
				for (Iterator iterator = Winkel.getInstance().getAanbiedingen().iterator(); iterator
						.hasNext();) {
					Aanbieding aanbieding = (Aanbieding) iterator.next();
					prijs = aanbieding.getAanbiedingPrijs(p, datum);
				}
				result += prijs * transactieRegels[i].getAantal() * p.getPC() / 100.0 ;
			}
		}
		
		return result;
	}

	public void setDatum(Calendar datum) {
		this.datum = datum;
	}
}
