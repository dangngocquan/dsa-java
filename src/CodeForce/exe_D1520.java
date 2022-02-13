package CodeForce;

import java.util.Scanner;

public class exe_D1520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			
			for (int j = 2; j <= n; j++) {
				a[j] = scanner.nextInt();
				for (int k = j-1; k >= 1; k--) {
					if (a[j] - a[k] ==  j - k) {
						b[j] = b[k] + 1;
						ans[i] += b[j];
						break;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
