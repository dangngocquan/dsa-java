package codeForce;

import java.util.Scanner;

public class B1650 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int a = scanner.nextInt();
			int l1 = l/a;
			int r1 = r/a;
			if (l1 == r1) {
				System.out.println(r1 + r%a);
			}else {
				int x1 = r1 + r%a;
				int x2 = r1 - 1 + a - 1;
				if (x1 >= x2) {
					System.out.println(x1);
				}else {
					System.out.println(x2);
				}
			}
		}
		scanner.close();
	}
}
