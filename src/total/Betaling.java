package total;

import java.util.Calendar;
import java.util.Iterator;

public class Betaling {
	private int betalingsNummer;
	private String omschrijving;
	private Calendar betalingsDatum;
	private BetalingsRegel[] betalingsRegels;
	private int aantalRegelsInBetaling = 0;

	public Betaling(int betalingsNummer, String omschrijving) {
		this.betalingsNummer = betalingsNummer;
		this.omschrijving = omschrijving;
		this.betalingsDatum = Calendar.getInstance();
		this.betalingsRegels = new BetalingsRegel[100];
	}

	public void addBetalingsRegel( Brandstof brandstof, int aantalLiters){
		BetalingsRegel tr = new BetalingsRegel(brandstof, aantalLiters);
		betalingsRegels[aantalRegelsInBetaling] = tr;
		aantalRegelsInBetaling++;
	}
	
	public double getTotaalPrijsExBTW() {
		double regelTotaal = 0.0;
		for (BetalingsRegel betalingsRegel : betalingsRegels){
			if(betalingsRegel != null){
				Brandstof brandstof = betalingsRegel.getbrandstof();
				double literPrijs = brandstof.getLiterPrijs();
				regelTotaal += literPrijs * betalingsRegel.getAantalLiters();
			}
		}
		return regelTotaal;
	}

	public double getBTW() {
		return getTotaalPrijsExBTW() * 0.21;
	}

	public void setBetalingsDatum(Calendar betalingsDatum) {
		this.betalingsDatum = betalingsDatum;
	}
	
	public int getAantalRegelsInBetaling() {
		return aantalRegelsInBetaling;
	}
}
