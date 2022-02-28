package codeForce;

import java.util.Scanner;

public class A750 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		if (k<=240) {
			res = (int)(Math.floor(Math.sqrt((480 + 1.25 - 2.0*k)/5) -1.0/2));
			if (res < 0) {
				res = 0;
			}
			if (res > n) res = n;
		}
		//Output
		System.out.println(res);
	}
}
