package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Doan Thanh Tung - 20225946
public abstract class Media {
	int id;
	String title;
	String category;
	float cost;
	// Doan Thanh Tung - 20225946
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	// Doan Thanh Tung - 20225946
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Doan Thanh Tung - 20225946
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	// Doan Thanh Tung
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media media = (Media) o;
			if (media.getTitle() == this.title) {
				return true;
			}
		}
		return false;
	}

//	public String toString() {
//		return "DOAN THANH TUNG ||" + "Media informations:\n" + "title: " + title + "\ncategory: " + category
//				+ "\ncost: " + cost + "\n";
//	}

	// Doan Thanh Tung - 20225946
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		CompactDisc cd = new CompactDisc(1, "My Heart Will Go On", "Pop", 15.0f);
		DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Inception", "Science Fiction", 199.99f);
		Book book = new Book(3, "Clean Code", "Programming", 35.5f);
		mediae.add(book);
		mediae.add(dvd);
		mediae.add(cd);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
	}
}
