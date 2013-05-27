package total;

public class Brandstof {
	private int getal; // identificatie 
	private String tekst; // wat is het voor een brandstof 
	private double pr; // de literprijs
	
	public Brandstof() {
		
	}

	public Brandstof(int getal, String tekst, double pr) {
		this.getal = getal;
		this.tekst = tekst;
		this.pr = pr;
	}

	public int getGetal() {
		return getal;
	}

	public void setGetal(int getal) {
		this.getal = getal;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public double getPR() {
		return pr;
	}

	public void setPR(double pr) {
		this.pr = pr;
	}
}
