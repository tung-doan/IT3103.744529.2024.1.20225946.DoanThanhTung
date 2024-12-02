package hust.soict.dsai.aims.media;

import java.util.ArrayList;

//Doan Thanh Tung - 20225946

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	// DOan Thanh Tung - 20225946
	public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(id, title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Doan Thanh Tung || " + track + "is added successfully");
		}
		System.out.println(track + " is already in the track list");
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Doan Thanh Tung || " + track + "is removed successfully");
		} else {
			System.out.println("Doan Thanh Tung || " + track + "is not in the track list");
		}
	}

	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}

	@Override
	public void play() {
		System.out.println("DOAN THANH TUNG || Playing CD: " + this.getTitle());
		System.out.println("DOAN THANH TUNG || CD length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}

	public String toString() {
		return "CD: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - "
				+ getLength() + "s - $" + getCost();
	}
}
