package codeForce;

import java.util.Scanner;

public class A1651 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.println((long)(Math.pow(2, n) - 1));
		}
		scanner.close();
	}
}
