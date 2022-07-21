package codeforces;

import java.util.Scanner;

public class A686 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long x = scanner.nextLong();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			String s = scanner.next();
			long d = scanner.nextLong();
			if (s.equals("+")) {
				x += d;
			}else {
				if (x < d) {
					count++;
				}else {
					x -= d;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(x + " " + count);
	}
}
