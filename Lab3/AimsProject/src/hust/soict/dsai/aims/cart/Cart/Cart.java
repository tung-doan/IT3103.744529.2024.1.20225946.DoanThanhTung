package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

// Doan Thanh Tung - 20225946
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.println(disc.getTitle() + " is added sucessfully");
			return;
		}
		System.out.println("the cart is full");
	}

	// Doan Thanh Tung 20225946
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered[qtyOrdered++] = dvdList[i];
				System.out.println(dvdList[i].getTitle() + " is added sucessfully");
			} else {
				System.out.println("the cart is full");
				break;
			}
		}
		return;
	}

//	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//		for (int i = 0; i < dvdList.length; i++) {
//			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
//				itemsOrdered[qtyOrdered++] = dvdList[i];
//				System.out.println(dvdList[i].getTitle() + " is added sucessfully");
//			} else {
//				System.out.println("the cart is full");
//				break;
//			}
//		}
//		return;
//	}
//	

	// Doan Thanh Tung - 20225946
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED - 2) {
			itemsOrdered[qtyOrdered++] = dvd1;
			itemsOrdered[qtyOrdered++] = dvd2;
			System.out.println(dvd1.getTitle() + " and " + dvd2.getTitle() + " has been added!");
			qtyOrdered++;
		} else
			System.out.println("The cart is full.");
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered.length == 0) {
			System.out.println("nothing in the cart!");
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				System.out.println(disc.getTitle() + " is removed sucessfully");
				return;
			}
		}
		System.out.println("there is no DVD like that in your cart!");
	}

	public float totalcost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

	// Doan Thanh Tung - 20225946
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString());
		}
		System.out.printf("Total cost: $%.2f\n", totalcost());
		System.out.println("**************************************************");
	}

	// Doan Thanh Tung - 20225946
	public void search(int id) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(id)) {
				System.out.println("\nSuccessfull");
				System.out.println(itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("\nNot Found!");
	}

	// Doan Thanh Tung - 20225946
	public void search(String title) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("\nSuccessfull");
				System.out.println(itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("\nNot Found!");
	}
}
