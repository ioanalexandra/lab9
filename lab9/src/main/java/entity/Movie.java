package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "movies")
@Table(name = "movies")
public class Movie {
//obiect de tip movie care e independent de baza de date

	// punem adnotari ca sa stie cum sa converteasca OpenCSvul
	private String title;
	private int duration;
	private String releaseDate;
	private int score;
	private int id;

	public Movie() {
	}

	public Movie(String title, int duration, String releaseDate, int score) {
		this.title = title;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.score = score;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "duration")
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name = "release_date")
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Column(name = "score")
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Id // pt cheie primara
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // cheie primara care se autoincrementeaza
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", duration=" + duration + ", releaseDate=" + releaseDate + ", score=" + score
				+ "]\n";
	}

	public void setId(int id) {
		this.id = id;
	}

}