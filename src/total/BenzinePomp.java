package total;

import java.util.ArrayList;
import java.util.Calendar;

public class BenzinePomp {
	
	private static BenzinePomp benzinePomp;
	
	private ArrayList<Brandstof> brandstoffen = new ArrayList<Brandstof>();
	private ArrayList<Betaling> betalingen = new ArrayList<Betaling>();
	
	private BenzinePomp(){};
	
	public static BenzinePomp getBenzinePomp() {
		if (benzinePomp == null){ 
			benzinePomp = new BenzinePomp();
		}
		return benzinePomp;
	}
	
	public ArrayList<Brandstof> getBrandstoffen() {
		return brandstoffen;
	}

	public void setBrandstofen(ArrayList<Brandstof> brandstoffen) {
		this.brandstoffen = brandstoffen;
	}

	public ArrayList<Betaling> getBetalingen() {
		return betalingen;
	}

	public void addBetaling( Betaling betaling ) {
		betalingen.add(betaling);
	}
}
