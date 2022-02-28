package CodeForce;

import java.util.Scanner;

public class exe_A1478 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i=0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			for (int j = 0; j < n; j++) a[scanner.nextInt()]++;
			for (int j : a) ans[i] = Math.max(ans[i], j);
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
