package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	// Doan Thanh Tung - 20225946
	public int compare(Media o1, Media o2) {
		return Comparator.comparing(Media::getCost).thenComparing(Media::getTitle).compare(o1, o2);
	}
}