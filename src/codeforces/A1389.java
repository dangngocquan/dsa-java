package codeforces;

import java.util.Scanner;

public class A1389 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] x = new int[t];
		int[] y = new int[t];
		for (int i = 0; i < t; i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			x[i] = -1;
			y[i] = -1;
			if (l*2 <= r) {
				x[i] = l;
				y[i] = 2*l;
			}
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) System.out.println(x[i] + " " + y[i]);
	}
}
