package luyencode;

import java.util.Scanner;

public class VT07 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[11];
		for (int i =0; i < 11; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == a[10]) {
				System.out.print((i+1) + " ");
				count++;
			}
		}
		if (count == 0) System.out.println(-1);
	}
}
