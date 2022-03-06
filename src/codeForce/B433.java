package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class B433 {
	public static void main(String[] args) {
		//Input + Output
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] v = new long[n+1];
		long[] u = new long[n+1];
		for (int i = 0; i < n; i++) {
			u[i] = scanner.nextLong();
			v[i+1] = v[i] + u[i];
		}
		Arrays.sort(u);
		for (int i = 1; i <= n; i++) u[i] = u[i] + u[i-1];
		int m = scanner.nextInt();
		while (m-- > 0) {
			int type = scanner.nextInt();
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			System.out.println((type == 1)? v[r] - v[l-1] : u[r] - u[l-1]);
		}
		scanner.close();
	}
}
