package hust.soict.dsai.aims.media;

// Doan Thanh Tung - 20225946
public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;

	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		System.out.println("DOAN THANH TUNG || Playing DVD: " + this.getTitle());
		System.out.println("DOAN THANH TUNG || DVD length: " + this.getLength());
	}

	public String toString() {
		return "DVD: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + "s - $"
				+ getCost();
	}
}
