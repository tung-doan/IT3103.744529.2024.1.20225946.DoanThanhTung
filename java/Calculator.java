package hello.java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get input from user
		System.out.print("Doan Thanh Tung - 5946 - Enter the first number: ");
		double a = input.nextDouble();
		System.out.print("Doan Thanh Tung - 5946 - Enter the second number: ");
		double b = input.nextDouble();
		input.close();
		// Sum of the numbers
		System.out.println("Sum of the numbers: " + (a + b));
		// Difference of the numbers
		System.out.println("Difference of the numbers: " + (a - b));
		// Product of the numbers
		System.out.println("Product of the numbers: " + (a * b));
		// Quotient of the numbers
		System.out.println("Quotient of the numbers: " + (a / b));
		System.exit(0);
	}
}