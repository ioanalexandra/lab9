package lab9;

import java.util.List;

import entity.Movie;
import repository.MovieRepo;

public class Main {

	public static void main(String[] args) {
		FactoryManager fm = FactoryManager.getInstance();
		fm.start();
		// cream un movie repository si efectuam cautarea dupa nume pe el
		MovieRepo mr = new MovieRepo();

		List<Movie> lm = mr.findByName("%ana%");
		for (Movie m : lm) {
			System.out.println(m);
		}
		Chart c = new Chart("Top filme cu 'ana'", lm);
		System.out.println(c);
		fm.finish();
		// inchidem totul

	}

}
