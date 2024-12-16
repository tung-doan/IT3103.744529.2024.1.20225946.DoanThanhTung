package Lab1;

import java.util.Scanner;

// Doan Thanh Tung - 5946
public class AddMatrices {
	public static void main(String args[]) {
		System.out.print("Doan Thanh Tung - 5946 - Enter the size of matrices: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		double[][] matrix1 = new double[size][size];
		double[][] matrix2 = new double[size][size];
		double[][] Summatrix = new double[size][size];
		System.out.println("Doan Thanh Tung - 5946 - Please enter the first matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Doan Thanh Tung - 5946 - Please enter the second matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix2[i][j] = input.nextDouble();
				Summatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("the sum of two matrices is: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(Summatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
