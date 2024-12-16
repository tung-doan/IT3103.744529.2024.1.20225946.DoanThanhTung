package hust.soict.hedspi.aims.media;

//Doan Thanh Tung - 20225946
public class Disc extends Media {
	private int length;
	private String director;

	// Doan Thanh Tung - 20225946
	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Disc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}

	public String getDirector() {
		return this.director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
