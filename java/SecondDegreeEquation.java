package hello.java;

import java.util.Scanner;

//Doan Thanh Tung - 5946
public class SecondDegreeEquation {
	public static void main(String args[]) {
		System.out.println("Doan Thanh Tung - 5946 - moi nhap cac so a, b, c: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double delta = b * b - 4 * a * c;
		double result = 0;
		if (a == 0) {
			result = -c / b;
			System.out.println("phuong trinh co nghiem duy nhat la: " + result);
		}
		if (delta < 0) {
			System.out.println("phuong trinh vo nghiem");
		} else if (delta == 0) {
			result = -b / (2 * a);
			System.out.println("phuong trinh co nghiem kep la: " + result);
		} else {
			double result1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			double result2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			System.out.println("phuong trinh co 2 nghiem la: " + result1 + " va " + result2);
		}
		System.exit(0);
	}
}
