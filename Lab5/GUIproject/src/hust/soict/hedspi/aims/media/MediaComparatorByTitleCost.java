package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	// Doan Thanh Tung - 20225946
	public int compare(Media o1, Media o2) {
		return Comparator.comparing(Media::getTitle).thenComparing(Media::getCost).compare(o1, o2);
	}

}
