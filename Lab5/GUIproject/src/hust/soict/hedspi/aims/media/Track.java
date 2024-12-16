package hust.soict.hedspi.aims.media;

//Doan Thanh Tung - 20225946
public class Track implements Playable {
	private int length;
	private String title;

	// Doan Thanh Tung - 20225946
	public Track(int length, String title) {
		this.length = length;
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("DOAN THANH TUNG || Playing DVD: " + this.getTitle());
		System.out.println("DOAN THANH TUNG || DVD length: " + this.getLength());
	}

	// Doan Thanh Tung - 20225946
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track track = (Track) o;
			if (track.getTitle().equals(title) && track.getLength() == length) {
				return true;
			}
		}
		return false;
	}
}
