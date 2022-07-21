package codeforces;

import java.util.Scanner;

public class C1399 {
	static int solve(int[] w, int size, int weightTotal) {
		int count = 0;
		for (int i = 1; i <= weightTotal/2; i++) {
			if (weightTotal-i > size) continue;
			if (i == weightTotal-i) {
				count += w[i]/2;
			}else {
				count += Math.min(w[i], w[weightTotal-i]);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] w = new int[n+1];
			for (int i = 0; i < n; i++) w[scanner.nextInt()]++;
			int max = 0;
			for (int i = 2; i <= 2*n; i++) {
				max = Math.max(max, solve(w, n, i));
			}
			System.out.println(max);
		}
		scanner.close();
	}
}
