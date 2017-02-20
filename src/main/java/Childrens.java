import java.math.BigDecimal;

public class Childrens extends Movie {//contains price code and calculate fees method

	public Childrens(String title) {
		super(title, "Children's Movie");

	}

	public BigDecimal calculateFees(int days) {

		BigDecimal amount = new BigDecimal("1.50");

		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}

		return amount;
	}

	public String getPriceCode() {

		return this.priceCode;
	}

}
