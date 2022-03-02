package luyenCode;

import java.util.Scanner;

public class VT08 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		for (int i = 1; i < n; i += 2) {
			if (i == n-1) {
				a[i] += a[i-1];
			}else {
				a[i] += Math.abs(a[i-1] - a[i+1]);
			}
		}
		//Output
		for (int i : a) System.out.print(i + " ");
	}
}
