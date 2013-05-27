package total;

import java.util.ArrayList;
import java.util.Calendar;

public class Pomp {
	
	private static Pomp pomp;
	
	private ArrayList<Brandstof> allebrandstoffen = new ArrayList<Brandstof>();
	private ArrayList<Betaling> allebetalingen = new ArrayList<Betaling>();
	
	private Pomp(){};
	
	public static Pomp getInstance() {
		if (pomp == null) pomp = new Pomp();
		return pomp;
	}
	
	public ArrayList<Brandstof> getbrandstoffen() {
		return allebrandstoffen;
	}

	public void setbrandstofen(ArrayList<Brandstof> allebrandstoffen) {
		this.allebrandstoffen = allebrandstoffen;
	}

	public ArrayList<Betaling> getbetalingen() {
		return allebetalingen;
	}

	public void addBetaling( Betaling t ) {
		allebetalingen.add(t);
	}
}
