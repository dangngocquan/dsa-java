package codeforces;

import java.util.Scanner;

public class A1391 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < t; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Output
		for (int n : a) {
			for (int i = 1; i <= n; i++) System.out.print(i + " ");
			System.out.println();
		}
	}
}
