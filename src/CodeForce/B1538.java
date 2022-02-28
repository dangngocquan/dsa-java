package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class B1538 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int sum = 0;
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			for (int j = 1; j <= n; j++) {
				a[j] = scanner.nextInt();
				sum += a[j];
			}
			if (sum%n==0) {
				Arrays.sort(a);
				for (int j = n; j >= 1; j--) {
					if (a[j] > sum/n) {
						ans[i] += 1;
					}else {
						break;
					}
				}
			}else {
				ans[i] = -1;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
