package codeForce;

import java.util.Scanner;

public class A1345 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 1 || m == 1) {
				System.out.println("YES");
			}else if (n == 2) {
				if (m <= 2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
