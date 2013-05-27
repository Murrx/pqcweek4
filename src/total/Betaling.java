package total;

import java.util.Calendar;
import java.util.Iterator;

public class Betaling {
	private int betalingNr;
	private String betalingType;
	private Calendar datum;
	private double som1;
	private double som2;
	private Onderdelen[] onderdelen;
	
	public Betaling(int betalingNr, String betalingType) {
		this.betalingNr = betalingNr;
		this.betalingType = betalingType;
		this.datum = Calendar.getInstance();
		this.som1 = 0.0;
		this.som2 = 0.0;
		this.onderdelen = new Onderdelen[100];
	}

	public void addbrandstofTobetaling( Brandstof p, int aantal){
		// eerst controleren hoeveel betalingregels er al zijn
		int aantalBestaandeRegels = 0;
		for (int i = 1; i < onderdelen.length; i++) {
			if (onderdelen[i] != null) {
				aantalBestaandeRegels++;
			}
		}
		Onderdelen tr = new Onderdelen(p, aantal);
		onderdelen[aantalBestaandeRegels] = tr;
	}
	
	public double getbetalingTotaal() {
		double result = 0.0;
		for (int i = 0; i < onderdelen.length; i++) {
			if (onderdelen[i] != null) {
				Brandstof p = onderdelen[i].getbrandstof();
				double prijs = p.getPR();
				result += prijs * onderdelen[i].getAantal();
			}
		}
		
		return result;
	}

	public double getbetalingTotaal2() {
		double result = 0.0;
		for (int i = 0; i < onderdelen.length; i++) {
			if (onderdelen[i] != null) {
				Brandstof p = onderdelen[i].getbrandstof();
				double prijs = p.getPR();
				result += prijs * onderdelen[i].getAantal() * 0.21;
			}
		}
		
		return result;
	}

	public void setDatum(Calendar datum) {
		this.datum = datum;
	}
}
