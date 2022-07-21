package luyencode;

import java.util.Scanner;

public class DK06 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		if (a==0) {
			if (b==0) {
				System.out.println("INF");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.printf("%.2f",-b*1.0/a);
		}
	}
}
