package total;

public class Onderdelen {
	private Brandstof brandstof;
	private int aantal;
	
	public Onderdelen(Brandstof brandstof, int aantal) {
		this.brandstof = brandstof;
		this.aantal = aantal;
	}

	private double ditTotaal;

	public Brandstof getbrandstof() {
		return brandstof;
	}

	public int getAantal() {
		return aantal;
	}

	public double getRegelTotaal() {
		return ditTotaal;
	}
	
}
