import java.math.BigDecimal;

public class Regular extends Movie {

	public Regular(String title) {//contains price code and calculate fees method
		super(title, "regular");

	}

	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("2.00");

		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			amount = amount.add(new BigDecimal("1.5").multiply(extraDays));
		}

		return amount;
	}

	public String getPriceCode() {
		return "Regular Movie";
	}

}
