public class Product {
	private int unit;

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getUnit() {
		return unit;
	}

	public int getTotalprice() {
		return unit * 100;
	}

	public String toString() {
		return "You buy " + this.unit + " units " + "(" + getTotalprice() + ").";
	}

}
