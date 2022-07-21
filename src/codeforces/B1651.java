package codeforces;

import java.util.Scanner;

public class B1651 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			if (n > 19) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				int x = 1;
				for (int i = 1; i <= n; i++) {
					System.out.print(x+ " ");
					x *= 3;
				}
			}
		}
		scanner.close();
	}
}
