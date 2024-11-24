package hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Doan Thanh Tung - 20225946
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private float cost;
	private int length;
	private int id;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		String temp = getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": "
				+ this.getCost() + "$";
		return temp;

	}

	// Doan Thanh Tung - 20225946
	public boolean isMatch(int id) {
		return this.id == id;
	}

	public boolean isMatch(String title) {
		return this.title.toLowerCase().equals(title.toLowerCase());
	}
}
