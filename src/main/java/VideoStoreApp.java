
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalStatement statement = new RentalStatement();//create new Rental Statement object 
														  //called 'statement'
		
		//create new movies of "Movie type
		Movie regular = new Regular("Star Wars");
		Movie childrens = new Childrens("Disney's Jungle Book");
		Movie newRelease = new NewRelease("Dr. Strange");
		
		//create new rentals and give the number of days rented
		Rental regularMovie = new Rental(regular, 2);
		Rental childrensMovie = new Rental(childrens, 2);
		Rental newreleaseMovie = new Rental(newRelease, 2);
		
		//add the movies to the collection in the RentalStatement class and print rental statement
		statement.add(regularMovie);
		statement.add(childrensMovie);
		statement.add(newreleaseMovie);
		statement.print();	
		
	}

}
