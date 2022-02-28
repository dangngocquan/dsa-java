package luyenCode;

import java.util.Scanner;

public class VL09 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		double ans = 0;
		double temp = 1;
		for (int i = 1; i <= n; i++) {
			temp *= x/i;
			ans += temp;
		}
		//Output
		System.out.printf("%.2f",ans);
	}
}
