package lab9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Movie;

public class FactoryManager {
	// singleton
	private static FactoryManager inst = null;
	private static EntityManagerFactory f = null;

	private EntityManager manager = null;

	private FactoryManager() {
		f = Persistence.createEntityManagerFactory("movies-unit");
	}

	public static FactoryManager getInstance() {
		if (inst == null) {
			inst = new FactoryManager();
		}
		return inst;
	}

	public void start() {
		manager = f.createEntityManager();
		manager.getTransaction().begin();
	}

	public void finish() {
		manager.getTransaction().commit();
		manager.close();
		f.close();
	}

	public void create(Movie m) {
		if (manager.find(Movie.class, m.getId()) == null) {
			manager.persist(m);
		} else {
			manager.merge(m);
		}
	}

	public Movie find(int id) {
		return manager.find(Movie.class, id);
	}

	public EntityManager getManager() {
		return manager;
	}
}