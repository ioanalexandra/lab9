package lab9;

import java.util.Date;
import java.util.List;

import entity.Movie;

public class Chart {
	private String name;
	private Date date;
	private List<Movie> list;

	public Chart(String name, List<Movie> list) {
		date = java.util.Calendar.getInstance().getTime();
		this.name = name;
		this.list = list;
	}

	private void orderList() {
		list.sort((Movie m1, Movie m2) -> {
			if (m1.getScore() == m2.getScore()) {
				return 0;
			}
			if (m1.getScore() < m2.getScore()) {
				return 1;
			}
			return -1;
		});
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Movie> getList() {
		return list;
	}

	public void setList(List<Movie> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		orderList();
		return "Chart [name=" + name + ", date=" + date + ", list=" + list + "]";
	}

}
