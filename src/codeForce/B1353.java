package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class B1353 {
	static int getResult(int n, int k, int[] a, int[] b) {
		int res = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < n; i++) {
			if (i<k) {
				if (a[i] < b[n-1-i]) {
					res += b[n-1-i];
				}else {
					res += a[i];
				}
			}else {
				res += a[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
			}
			for (int j = 0; j < n; j++) {
				b[j] = scanner.nextInt();
			}
			res[i] = getResult(n, k, a, b);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
