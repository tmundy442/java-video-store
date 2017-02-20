import java.math.*;

public class Rental {// makes a new rental for each movie to put them in
						// 'rentals' collection in RentalStatement class
	Movie rented;
	int days;

	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}

	public String getTitle() {
		return rented.getTitle();
	}

	public String getPriceCode() {
		return rented.getPriceCode();
	}

	public BigDecimal calculateFees() {
		BigDecimal fee = rented.calculateFees(days);
		return fee;
	}

}
