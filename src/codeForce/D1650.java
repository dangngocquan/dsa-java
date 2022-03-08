package codeForce;

import java.util.Scanner;

public class D1650 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] arr = new int[n+1];
			int[] ans = new int[n+1];
			for (int i = 1; i <= n; i++) arr[scanner.nextInt()] = i;
			for (int i = n; i >= 1; i--) {
				if (arr[i] < i) {
					ans[i] = arr[i] + i - i;
					for (int j = 1; j <= i; j++) {
						arr[j] -= ans[i];
						if (arr[j] <= 0) arr[j] += i;
					}
				}
			}
			for (int i = 1; i <= n; i++) System.out.print(ans[i] + " ");
			System.out.println();
		}
		scanner.close();
	}
}
