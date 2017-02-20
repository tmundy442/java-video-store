import java.math.BigDecimal;

public abstract class Movie {// Movie is superclass of Regular,
								// Childrens and NewRelease

	String title;
	String priceCode;

	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;

	}

	public String getTitle() {
		return title;
	}

	public abstract String getPriceCode();

	public abstract BigDecimal calculateFees(int days);

	public void print() {
		print();

	}

}
