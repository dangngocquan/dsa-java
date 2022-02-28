package CodeForce;

import java.util.Scanner;

public class A459 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		scanner.close();
		//Output
		if (x1 == x2) {
			int d = Math.abs(y1-y2);
			System.out.println((x1+d) + " " + y1 + " " + (x2 + d) + " " + y2);
		}else {
			if (y1 == y2) {
				int d = Math.abs(x1-x2);
				System.out.println(x1 + " " + (y1+d) + " " + x2 + " " + (y2+d));
			}else {
				int d1 = Math.abs(x1-x2);
				int d2 = Math.abs(y1-y2);
				if (d1 == d2) {
					System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
				}else {
					System.out.println(-1);
				}
			}
		}
 	}
}
