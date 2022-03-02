package luyenCode;

import java.util.Scanner;

public class VT12 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x > max) max = x;
			if (x < min) min = x;
		}
		scanner.close();
		//Output
		System.out.println(max - min);
	}
}
