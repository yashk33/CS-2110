public class DVD extends AmazonProduct {
	final double taxRate = 0.03;

	public DVD(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.ENTERTAINMENT, prime );
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
