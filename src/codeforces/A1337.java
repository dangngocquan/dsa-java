package codeforces;

import java.util.Scanner;

public class A1337 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] x = new int[t];
		int[] y = new int[t];
		int[] z = new int[t];
		for (int i = 0; i < t; i++) {
//			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
//			int d = scanner.nextInt();
			// a x b y c z d
			// x + y > z
			x[i] = b;
			y[i] = c;
			z[i] = c;
		}
		scanner.close();
		for (int i = 0; i < t; i++) System.out.println(x[i] + " " + y[i] + " " + z[i]);
		
	}
}
