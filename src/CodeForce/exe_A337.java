package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A337 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] f = new int[m];
		for (int i = 0; i <  m; i++) {
			f[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(f);
		int res = f[n-1] - f[0];
		for (int i = n-1; i <m; i++) {
			res = Math.min(res, f[i] - f[i-n+1]);
		}
		//Output
		System.out.println(res);
	}
}
