package codeForce;

import java.util.Scanner;

public class B1619 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] n = new long[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextLong();
		scanner.close();
		//Solve + out
		for (long i : n) {
			long count = (long)(Math.floor(Math.sqrt(i))) + (long)(Math.floor(Math.cbrt(i))) - (long)(Math.floor(Math.sqrt(Math.cbrt(i))));
			System.out.println(count);
		}
	}
}
