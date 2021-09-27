public class Milk extends AmazonProduct {
	final double taxRate = 0.01;

	public Milk(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.PRODUCE, prime );
	}

	@Override
	public double calcTax() {
		return this.getPrice() * taxRate;
	}

	@Override
	public boolean isCouponEligible() {
		return true;
	}
}
