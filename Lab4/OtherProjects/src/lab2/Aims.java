package lab2;

// Doan Thanh Tung - 20225946
public class Aims {
	public static void main(String args[]) {
		Cart order = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon the movie", "Anime", "Zen Soichiro", 90, 25.50f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Spiderman no way home", "Science Fiction", "Jon Watts", 90,
				30.15f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Naruto", "Anime", 21.30f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Diary of a Wimpy Kid", "Comedy", "Thor Freudenthal", 40.50f);
		order.addDigitalVideoDisc(dvd1);
		System.out.println(dvd1.getId() + " (id)");
		order.addDigitalVideoDisc(dvd2);
		System.out.println(dvd2.getId() + " (id)");
		order.addDigitalVideoDisc(dvd3);
		System.out.println(dvd3.getId() + " (id)");
		order.addDigitalVideoDisc(dvd4);
		System.out.println(dvd4.getId() + " (id)");
	}
}
