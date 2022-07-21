package codeforces;

import java.util.Scanner;

public class A1256 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			int x = s/n;
			if (x <= a && s%n <= b) {
				System.out.println("YES");
			}else if (x > a) {
				s -= a*n;
				if (s <= b) {
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
