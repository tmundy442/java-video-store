import java.math.BigDecimal;

public class NewRelease extends Movie {//contains price code and calculate fees method

	public NewRelease(String title) {
		super(title, "New Release");

	}

	public BigDecimal calculateFees(int days) {

		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
	}

	public String getPriceCode() {

		return this.priceCode;
	}

}
