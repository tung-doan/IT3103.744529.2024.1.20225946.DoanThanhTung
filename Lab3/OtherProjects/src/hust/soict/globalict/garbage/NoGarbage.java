package hust.soict.globalict.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Doan Thanh Tung - 20225946
public class NoGarbage {
	public static void main(String[] args) {
		String filePath = "src/hust/soict/globalict/garbage/test.txt";
		StringBuilder garbage = new StringBuilder();
		long start = System.currentTimeMillis();

		try (FileReader fileReader = new FileReader(new File(filePath))) {
			int ch;
			while ((ch = fileReader.read()) != -1) {
				garbage.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
	}
}
