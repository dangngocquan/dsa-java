package codeforces;

import java.util.Scanner;

public class B1469 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] r = new int[n];
			for (int i = 0; i < n; i++) {
				r[i] = scanner.nextInt();
			}
			int m = scanner.nextInt();
			int[] b = new int[m];
			for (int i = 0; i < m; i++) {
				b[i] = scanner.nextInt();
			}
			
			int maxR = 0;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				temp += r[i];
				maxR = Math.max(maxR, temp);
			}
			
			int maxB = 0;
			temp = 0;
			temp = 0;
			for (int i = 0; i < m; i++) {
				temp += b[i];
				maxB = Math.max(maxB, temp);
			}
			
			System.out.println(maxB + maxR);
		}
		scanner.close();
	}
}
