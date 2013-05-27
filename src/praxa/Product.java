package praxa;

public class Product {
	private int getal; // identificatie 
	private String tekst; // wat is het voor een product 
	private double pr; // de prijs
	private double pc; // de procent
	
	public Product() {
		
	}

	public Product(int getal, String tekst, double pr, double pc) {
		this.getal = getal;
		this.tekst = tekst;
		this.pr = pr;
		this.pc = pc;
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

	public double getPC() {
		return pc;
	}

	public void setPC(double pc) {
		this.pc = pc;
	}
	
	
}
