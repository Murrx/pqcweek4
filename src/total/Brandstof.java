package total;

public class Brandstof {
	private int identificatieNummer; 
	private String omschrijving; 
	private double literPrijs;
	
	public Brandstof() {
		
	}

	public Brandstof(int identificatieNummer, String omschrijving, double literPrijs) {
		this.identificatieNummer = identificatieNummer;
		this.omschrijving = omschrijving;
		this.literPrijs = literPrijs;
	}

	public int getIdentificatieNummer() {
		return identificatieNummer;
	}

	public void setIdentificatieNummer(int identificatieNummer) {
		this.identificatieNummer = identificatieNummer;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public double getLiterPrijs() {
		return literPrijs;
	}

	public void setLiterPrijs(double prijs) {
		this.literPrijs = prijs;
	}
}
