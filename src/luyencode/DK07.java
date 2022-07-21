package luyencode;

import java.util.Scanner;

public class DK07 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Output
		if (a==0) {
			if (b==0) {
				if (c==0) {
					System.out.println("INF");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.printf("%.2f",-c*1.0/b);
			}
		}else {
			double x = b*b - 4*a*c;
			if (x< 0) {
				System.out.println("NO");
			}else if (x==0) {
				System.out.printf("%.2f",-b*1.0/2/a);
			}else {
				double x1 = (-b-Math.sqrt(x))/2/a;
				double x2 = (-b+Math.sqrt(x))/2/a;
				System.out.printf("%.2f",Math.min(x1, x2));
				System.out.printf(" %.2f",Math.max(x1, x2));
			}
		}
	}
}
