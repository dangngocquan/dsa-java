package luyencode;

import java.util.Scanner;

public class VT03 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		int ans = -1;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x >= max) {
				ans = i;
				max = x;
			}
		}
		scanner.close();
		//Output
		System.out.println(ans);
	}
}
