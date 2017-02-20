import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<Rental>();//adds each movie to a collection

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() {//prints the collection in one statement

		for (Rental r : rentals) {

			System.out.println("Rental fee for the " + r.getPriceCode() + " " + r.getTitle() + " for " + r.days
					+ " days is $" + r.calculateFees());
			System.out.println("");

		}
	}
}
