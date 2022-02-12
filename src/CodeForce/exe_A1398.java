package CodeForce;

import java.util.Scanner;

public class exe_A1398 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			for (int j = 1; j <= n; j++) a[j] = scanner.nextInt();
			if (a[1] + a[2] <= a[n]) {
				ans[i] = "1 2 "+n;
			}else {
				ans[i] = "-1";
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
