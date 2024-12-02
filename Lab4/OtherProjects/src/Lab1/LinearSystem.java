package Lab1;

import java.util.Scanner;

//Doan Thanh Tung - 5946
public class LinearSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doan Thanh Tung - 5946 - nhap cac so a11, a12 va b1:");
		double a11 = scanner.nextDouble();
		double a12 = scanner.nextDouble();
		double b1 = scanner.nextDouble();
		System.out.println("Doan Thanh Tung - 5946 - nhap cac so a21, a22 va b2:");
		double a21 = scanner.nextDouble();
		double a22 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		scanner.close();
		double det = a11 * a22 - a21 * a12; // calculate the determinant
		double d1 = (a22 * b1 - a12 * b2);
		double d2 = (a11 * b2 - a21 * b1);
		if (det == 0) {
			if (d1 != d2)
				System.out.println("he phuong trinh vo so nghiem!");
			else
				System.out.println("he phuong trinh vo nghiem");
		} else {
			double x1 = d1 / det;
			double x2 = d2 / det;
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		}
		System.exit(0);
	}
}