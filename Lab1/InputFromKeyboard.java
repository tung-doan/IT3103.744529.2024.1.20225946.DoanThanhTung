package hello.java;

import java.util.Scanner;

// Doan Thanh Tung -5946
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I am Doan Thanh Tung - 5946 - What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		System.out.println("Mr/Mrs. " + strName + ", " + iAge + " year(s) old. Your height is " + dHeight + "m.");
		System.exit(0);
	}
}