package total;

public class BetalingsRegel {
	private Brandstof brandstof;
	private int aantalLiters;

	
	public BetalingsRegel(Brandstof brandstof, int aantalLiters) {
		this.brandstof = brandstof;
		this.aantalLiters = aantalLiters;
	}

	public Brandstof getbrandstof() {
		return brandstof;
	}

	public int getAantalLiters() {
		return aantalLiters;
	}

//	private double ditTotaal;
//	public double getRegelTotaal() {
//		return ditTotaal;
//	}	
}
