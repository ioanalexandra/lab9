package repository;

import java.util.List;

public interface AbstractRepository<T> {
	void create(T m);

	T findById(int id);

	List<T> findByName(String name);
}
