package luyenCode;

import java.util.Scanner;

public class VL04 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		double ans = 0;
		for (int i = 2; i <= n; i++) {
			ans += 1.0/i;
		}
		//Output
		System.out.printf("%.4f",ans);
	}
}
