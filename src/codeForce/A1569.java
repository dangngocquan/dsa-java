package codeForce;

import java.util.Scanner;

public class A1569 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			boolean isDone = false;
			for (int i = 0; i < n - 1; i++) {
				if (s.charAt(i) != s.charAt(i+1)) {
					System.out.println((i+1) + " " + (i+2));
					isDone = true;
					break;
				}
			}
			if (!isDone) {
				System.out.println("-1 -1");
			}
		}
		scanner.close();
	}
}
