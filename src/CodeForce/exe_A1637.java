package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A1637 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				b[j] = a[j];
			}
			Arrays.sort(b);
			ans[i] = "NO";
			for (int j = 0; j <= n-2; j++) {
				if (a[j] != b[j]) {
					ans[i] = "YES";
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
