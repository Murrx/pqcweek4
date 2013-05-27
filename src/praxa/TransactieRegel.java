package praxa;

public class TransactieRegel {
	private Product product;
	private int aantal;
	
	public TransactieRegel(Product product, int aantal) {
		this.product = product;
		this.aantal = aantal;
	}

	private double regelTotaal;

	public Product getProduct() {
		return product;
	}

	public int getAantal() {
		return aantal;
	}

	public double getRegelTotaal() {
		return regelTotaal;
	}
	
}
