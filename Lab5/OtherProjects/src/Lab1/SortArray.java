package Lab1;

import java.util.Arrays;
import java.util.Scanner;

// Doan Thanh Tung - 5946
public class SortArray {
	public static void main(String args[]) {
		System.out.print("Doan Thanh Tung - 5946 - Enter the length of array that you want: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		System.out.println("Doan Thanh Tung - 5946 - Please enter the array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		double avarage = (double) sum / n;
		System.out.println("Array before sorting:" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorting:" + Arrays.toString(arr));
		System.out.println("the sum of the array is: " + sum);
		System.out.println("the avarage of the array is: " + avarage);
	}
}
