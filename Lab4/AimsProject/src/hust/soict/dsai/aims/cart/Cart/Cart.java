package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

// Doan Thanh Tung - 20225946
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private int qtyOrdered;

	public void addMedia(Media media) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println(media.getTitle() + " is added successfully (DOAN THANH TUNG)");
			qtyOrdered++;
		} else
			System.out.println("The cart is full");
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.size() == 0) {
			System.out.println("nothing in the cart!");
		}
		for (Media item : itemsOrdered) {
			if (item.equals(media)) {
				itemsOrdered.remove(item);
				System.out.println(media.getTitle() + " is removed successfully");
				qtyOrdered--;
				return;
			}
		}
		System.out.println("there is no media like that in your cart!");
	}

	public float totalcost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered.get(i).getCost();
			;
		}
		return sum;
	}

	// Doan Thanh Tung - 20225946
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered.get(i).toString());
		}
		System.out.printf("Total cost: $%.2f\n", totalcost());
		System.out.println("**************************************************");
	}

	// Doan Thanh Tung - 20225946
	public void search(int id) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println("\nSuccessfull");
				System.out.println(itemsOrdered.get(i).toString());
				return;
			}
		}
		System.out.println("\nNot Found!");
	}

	// Doan Thanh Tung - 20225946

	public void search(String title) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered.get(i).getTitle() == title) {
				System.out.println("\nSuccessfull");
				System.out.println(itemsOrdered.get(i).toString());
				return;
			}
		}
		System.out.println("\nNot Found!");
	}

	public int getLength() {
		return qtyOrdered;
	}

	public ArrayList<Media> ItemsInCart() {
		return itemsOrdered;
	}

}
