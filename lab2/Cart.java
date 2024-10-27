package lab2;

// Doan Thanh Tung - 20225946
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.println(disc.getTitle() + " is sucessfully added");
			return;
		}
		System.out.println("the cart is full");
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
				System.out.println(disc.getTitle() + " is sucessfuly removed");
				return;
			}
		}
		System.out.println("there is no DVD like that in your cart!");
	}

	public float totalcost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered - 1; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

	public void print() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
}
