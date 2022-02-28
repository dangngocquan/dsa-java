package CodeForce;

import java.util.Scanner;

public class A1537 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int sum = 0;
			for (int j = 1; j <= n; j++) sum += scanner.nextInt();
			if (sum < n) {
				ans[i] = 1;
			}else if (sum > n) {
				ans[i] = sum - n;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
