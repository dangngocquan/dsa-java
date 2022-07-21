package codeforces;

import java.util.Scanner;

public class A1657 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x == 0 && y == 0) {
				System.out.println(0);
			}else if (Math.sqrt(x*x + y*y) == (int)(Math.sqrt(x*x + y*y))) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}
		scanner.close();
	}
}
