package hust.soict.dsai.aims.Aims;

import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store.Store;

// Doan Thanh Tung - 20225946
public class Aims {
	static Store store = new Store();
	static Cart cart = new Cart();

	public static void showMenu() {
		System.out.println("\nDoan Thanh Tung - 20225946 - AIMS: ");
		System.out.println("------------------------------------");
		System.out.println("1.View store");
		System.out.println("2.Update store");
		System.out.println("3.See current cart");
		System.out.println("0. Exit");
		System.out.println("-----------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("\nDoan Thanh Tung - 20225946 - Options:");
		System.out.println("-------------------------------------");
		System.out.println("1.See a media's details");
		System.out.println("2.Add a media to cart");
		System.out.println("3.Play a media");
		System.out.println("4.See current cart");
		System.out.println("0.Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu(boolean check) {
		System.out.println("\nDoan Thanh Tung - 20225946 - Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. Add to cart");
		if (check) {
			System.out.println("2. Play");
		}
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("\nDoan Thanh Tung - 20225946 - Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void ViewStore(Scanner scanner) {
		for (Media item : store.ItemsInStore()) {
			System.out.println(item.toString());
		}
		while (true) {
			storeMenu();
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				seeMediaDetails(scanner);
				break;
			case 2:
				AddMedia(scanner);
				break;
			case 3:
				PlayMedia(scanner);
				break;
			case 4:
				SeeTheCurrentCart(scanner);
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	}

	public static void UpdateStore(Scanner scanner) {
		while (true) {
			System.out.println("Enter 1 to add media, 2 to remove media or 0 to back");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				System.out.println("Media's ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Media title: ");
				String title = scanner.nextLine();
				System.out.println("Media category: ");
				String category = scanner.nextLine();
				System.out.println("Media cost: ");
				float cost = scanner.nextFloat();
				scanner.nextLine();
				System.out.println("Kind of media: 1 for Disc, 2 for Book: ");
				int choose = scanner.nextInt();
				scanner.nextLine();
				switch (choose) {
				case 1:
					Disc disc = new CompactDisc(id, title, category, cost);
					store.addMedia(disc);
					break;
				case 2:
					Book book = new Book(id, title, category, cost);
					store.addMedia(book);
					break;
				default:
					System.out.println("It is not a kind of media!");
					break;
				}
				break;
			case 2:
				System.out.println("Please enter the media's title: ");
				String title2 = scanner.nextLine();
				int found = -1;
				for (int i = 0; i < store.ItemsInStore().size(); i++) {
					if (store.ItemsInStore().get(i).getTitle().equalsIgnoreCase(title2)) {
						found = i;
						break;
					}
				}
				if (found == -1) {
					System.out.println("The media is not in the store!");
				} else {
					store.removeMedia(store.ItemsInStore().get(found));
				}
				break;
			case 0:
				return;
			default:
				System.out.println("Invalid option! Please try again.");
				break;
			}
		}
	}

	public static void seeMediaDetails(Scanner scanner) {
		System.out.println("Doan Thanh Tung || Enter the media's title: ");
		String title = scanner.nextLine();
		int found = -1;
		for (int i = 0; i < store.ItemsInStore().size(); i++) {
			if (store.ItemsInStore().get(i).getTitle().equalsIgnoreCase(title)) {
				found = i;
				break;
			}
		}
		if (found == -1) {
			System.out.println("Can not find the media!");
		} else {
			System.out.println(store.ItemsInStore().get(found).toString());
			if (store.ItemsInStore().get(found) instanceof Disc) {
				mediaDetailsMenu(true);
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					cart.addMedia(store.ItemsInStore().get(found));
					System.out.println("Number of DVDs in the current cart: " + cart.getLength());
					break;
				case 2:
					if (store.ItemsInStore().get(found) instanceof DigitalVideoDisc) {
						DigitalVideoDisc digitaldisc = (DigitalVideoDisc) store.ItemsInStore().get(found);
						digitaldisc.play();
					} else if (store.ItemsInStore().get(found) instanceof CompactDisc) {
						CompactDisc compactdisc = (CompactDisc) store.ItemsInStore().get(found);
						compactdisc.play();
					}
					break;
				default:
					System.out.println("Please enter a valid option!");
					break;
				}
			} else {
				mediaDetailsMenu(false);
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					cart.addMedia(store.ItemsInStore().get(found));
					System.out.println("Number of DVDs in the current cart: " + cart.getLength());
					break;
				case 0:
					return;
				default:
					break;
				}
			}
		}
	}

	public static void AddMedia(Scanner scanner) {
		System.out.println("Doan Thanh Tung || Enter the media's title: ");
		String title = scanner.nextLine();
		int found = -1;
		for (int i = 0; i < store.ItemsInStore().size(); i++) {
			if (store.ItemsInStore().get(i).getTitle().equalsIgnoreCase(title)) {
				found = i;
				break;
			}
		}
		if (found == -1) {
			System.out.println("Can not find the media!");
		} else {
			cart.addMedia(store.ItemsInStore().get(found));
			System.out.println("Number of DVDs in the current cart: " + cart.getLength());
		}
	}

	public static void PlayMedia(Scanner scanner) {
		System.out.println("Doan Thanh Tung || Enter the media's title: ");
		String title = scanner.nextLine();
		int found = -1;
		for (int i = 0; i < store.ItemsInStore().size(); i++) {
			if (store.ItemsInStore().get(i).getTitle().equalsIgnoreCase(title)) {
				found = i;
				break;
			}
		}
		if (found == -1) {
			System.out.println("Can not find the media!");
		} else {
			if (store.ItemsInStore().get(found) instanceof DigitalVideoDisc) {
				DigitalVideoDisc digitaldisc = (DigitalVideoDisc) store.ItemsInStore().get(found);
				digitaldisc.play();
			} else if (store.ItemsInStore().get(found) instanceof CompactDisc) {
				CompactDisc compactdisc = (CompactDisc) store.ItemsInStore().get(found);
				compactdisc.play();
			} else {
				System.out.println("can not play a book");
			}
		}
	}

	public static void SeeTheCurrentCart(Scanner scanner) {
		for (Media media : cart.ItemsInCart()) {
			System.out.println(media.toString());
		}
		while (true) {
			cartMenu();
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				FilterMedia(scanner);
				break;
			case 2:
				SortMedia(scanner);
				break;
			case 3:
				RemoveMedia(scanner);
				break;
			case 4:
				PlayMedia(scanner);
				break;
			case 5:
				PlaceOrder();
				break;
			case 0:
				return;
			default:
				System.out.println("Please enter a valid option!");
				break;
			}
		}
	}

	public static void FilterMedia(Scanner scanner) {
		System.out.print("Choose an option to filter Media: ");
		System.out.println("1: By title, 2: By id: ");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			System.out.print("Please enter the title: ");
			String title = scanner.nextLine();
			for (Media media : cart.ItemsInCart()) {
				if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
					System.out.println(media.toString());
				}
			}
			break;
		case 2:
			System.out.print("Please enter the id: ");
			int id = scanner.nextInt();
			for (Media media : cart.ItemsInCart()) {
				if (media.getId() == id) {
					System.out.println(media.toString());
				}
			}
			break;
		default:
			System.out.println("please enter a valid option");
		}
	}

	public static void SortMedia(Scanner scanner) {
		System.out.println("Please choose if you'd like to sort by title or cost: 0 - title, 1 - cost");
		int option = scanner.nextInt();
		switch (option) {
		case 0:
			Collections.sort(cart.ItemsInCart(), Media.COMPARE_BY_TITLE_COST);
			System.out.println("cart is sorted by title successfully");
			for (Media media : cart.ItemsInCart()) {
				System.out.println(media.toString());
			}
			break;
		case 1:
			Collections.sort(cart.ItemsInCart(), Media.COMPARE_BY_COST_TITLE);
			System.out.println("cart is sorted by cost successfully");
			for (Media media : cart.ItemsInCart()) {
				System.out.println(media.toString());
			}
			break;
		}
	}

	public static void RemoveMedia(Scanner scanner) {
		System.out.println("please enter a media's title to remove: ");
		String title = scanner.nextLine();
		for (int i = 0; i < cart.ItemsInCart().size(); i++) {
			if (cart.ItemsInCart().get(i).getTitle().equalsIgnoreCase(title)) {
				cart.removeMedia(cart.ItemsInCart().get(i));
				return;
			}
		}
		System.out.println("Can not find media in the cart");
	}

	public static void PlaceOrder() {
		System.out.println("An order is created!");
		cart.ItemsInCart().clear();
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		CompactDisc cd = new CompactDisc(1, "My Heart Will Go On", "Pop", 15.0f);
		DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Inception", "Science Fiction", 199.99f);
		Book book = new Book(3, "Clean Code", "Programming", 35.5f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "alone in the dark", "Science Fiction", 199.99f);
		store.addMedia(book);
		store.addMedia(cd);
		store.addMedia(dvd);
		store.addMedia(dvd2);
		while (true) {
			showMenu();
			int options = scanner.nextInt();
			scanner.nextLine();
			switch (options) {
			case 1:
				ViewStore(scanner);
				break;
			case 2:
				UpdateStore(scanner);
				break;
			case 3:
				SeeTheCurrentCart(scanner);
				break;
			case 0:
				return;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
		}
	}
}
