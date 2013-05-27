package praxa;

import java.util.ArrayList;
import java.util.Calendar;

public class Winkel {
	
	private static Winkel winkel;
	
	private ArrayList<Aanbieding> alleAanbiedingen = new ArrayList<Aanbieding>();
	private ArrayList<Product> alleProducten = new ArrayList<Product>();
	private ArrayList<Transactie> alleTransacties = new ArrayList<Transactie>();
	
	private Winkel(){};
	
	public static Winkel getInstance() {
		if (winkel == null) winkel = new Winkel();
		return winkel;
	}

	public ArrayList<Aanbieding> getAanbiedingen() {
		return alleAanbiedingen;
	}
	
	public ArrayList<Product> getProducten() {
		return alleProducten;
	}

	public void setProducten(ArrayList<Product> alleProducten) {
		this.alleProducten = alleProducten;
	}

	public ArrayList<Transactie> getTransacties() {
		return alleTransacties;
	}

	public void setTransacties(ArrayList<Transactie> alleTransacties) {
		this.alleTransacties = alleTransacties;
	}

	public void addAanbieding( Aanbieding a ) {
		alleAanbiedingen.add(a);
	}
	public void addTransaction( Transactie t ) {
		alleTransacties.add(t);
	}
}
