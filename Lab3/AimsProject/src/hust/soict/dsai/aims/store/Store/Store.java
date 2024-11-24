package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

//Doan Thanh Tung - 20225946 
public class Store {
	private DigitalVideoDisc itemsInStore[];
	private int numberOfItems;

	public Store(int maxSize) {
		itemsInStore = new DigitalVideoDisc[maxSize];
		numberOfItems = 0;
	}

	public void addDVD(DigitalVideoDisc dvd) {
		if (numberOfItems < itemsInStore.length) {
			itemsInStore[numberOfItems++] = dvd;
			System.out.println(dvd.getTitle() + " is added successfully");
		} else {
			System.out.println("Max capacity!");
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < numberOfItems; i++) {
			if (itemsInStore[i].equals(dvd)) {
				for (int j = i; j < numberOfItems - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				numberOfItems--;
				System.out.println(dvd.getTitle() + " is removed successfully");
				return;
			}
		}
		System.out.println("Not found");
	}
}
