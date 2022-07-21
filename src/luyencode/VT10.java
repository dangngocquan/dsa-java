package luyencode;

import java.util.Arrays;
import java.util.Scanner;

public class VT10 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		Arrays.sort(a);
		//Output
		for (int i = n-1; i >= 0; i--) System.out.print(a[i] + " ");
	}
}
