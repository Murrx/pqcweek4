package total;

import java.util.Calendar;
import java.util.Iterator;

public class Betaling {
	private int betalingsNummer;
	private String omschrijving;
	private Calendar betalingsDatum;
	private BetalingsRegel[] betalingsRegels;
	private int aantalRegelsInBetaling = 0;
	
//	private double som1;
//	private double som2;
	
	
	public Betaling(int betalingsNummer, String omschrijving) {
		this.betalingsNummer = betalingsNummer;
		this.omschrijving = omschrijving;
		this.betalingsDatum = Calendar.getInstance();
//		this.som1 = 0.0;
//		this.som2 = 0.0;
		this.betalingsRegels = new BetalingsRegel[100];
	}

	public void addBetalingsRegel( Brandstof brandstof, int aantalLiters){
		BetalingsRegel tr = new BetalingsRegel(brandstof, aantalLiters);
		betalingsRegels[aantalRegelsInBetaling] = tr;
		aantalRegelsInBetaling++;
	}
	
	public double getbetalingTotaal() {
		double result = 0.0;
		for (int i = 0; i < betalingsRegels.length; i++) {
			if (betalingsRegels[i] != null) {
				Brandstof p = betalingsRegels[i].getbrandstof();
				double prijs = p.getLiterPrijs();
				result += prijs * betalingsRegels[i].getAantalLiters();
			}
		}
		
		return result;
	}

	public double getbetalingTotaal2() {
		double result = 0.0;
		for (int i = 0; i < betalingsRegels.length; i++) {
			if (betalingsRegels[i] != null) {
				Brandstof p = betalingsRegels[i].getbrandstof();
				double prijs = p.getLiterPrijs();
				result += prijs * betalingsRegels[i].getAantalLiters() * 0.21;
			}
		}
		
		return result;
	}

	public void setDatum(Calendar datum) {
		this.betalingsDatum = datum;
	}
}
