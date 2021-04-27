package repository;

import java.util.List;

import javax.persistence.TypedQuery;

import entity.Movie;
import lab9.FactoryManager;

public class MovieRepo implements AbstractRepository<Movie> {

	private FactoryManager fm = FactoryManager.getInstance();

	public void create(Movie m) {
		fm.create(m);
	}

	public Movie findById(int id) {
		return fm.find(id);
	}

	public List<Movie> findByName(String name) {
		// cautam dupa pattern
		TypedQuery<Movie> q = fm.getManager().createQuery("SELECT m FROM movies m WHERE m.title LIKE '" + name + "'",
				Movie.class);
		return q.getResultList();
	}

}
