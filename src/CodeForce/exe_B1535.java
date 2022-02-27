package CodeForce;

import java.util.Scanner;

public class exe_B1535 {
	static int gcd(int x, int y) {
		if (y==0) return x;
		return gcd(y,x%y);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
			for (int j = 0; j < n-1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (gcd(a[j],2*a[k]) > 1 || gcd(2*a[j],a[k]) > 1) ans[i]++;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
