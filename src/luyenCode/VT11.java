package luyenCode;

import java.util.Arrays;
import java.util.Scanner;

public class VT11 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[n-2];
		for (int i = 0; i < n-2; i++) a[i] = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		//Solve
		Arrays.sort(a);
		System.out.print(x +" ");
		for (int i : a) System.out.print(i+ " ");
		System.out.print(y);
	}
}
