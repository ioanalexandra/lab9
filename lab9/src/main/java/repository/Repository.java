package repository;

import java.util.List;

import entity.Movie;

public interface Repository {
	void create(Movie m);

	Movie findById(int id);

	List<Movie> findByName(String name);
}
