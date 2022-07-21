package luyencode;

import java.util.Scanner;

public class VT13 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int maxSum = a[0] + a[1];
		int firstNumber = a[0];
		int secondNumber = a[1];
		for (int i = 0; i < n-1; i++) {
			if (a[i] + a[i+1] >= maxSum) {
				maxSum = a[i] + a[i+1];
				firstNumber = a[i];
				secondNumber = a[i+1];
			}
		}
		if (a[n-1] + a[0] >= maxSum) {
			firstNumber = a[n-1];
			secondNumber = a[0];
		}
		//Output
		System.out.println(firstNumber + " " + secondNumber);
	}
}
