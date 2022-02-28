package CodeForce;

import java.util.Scanner;

public class C466 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = a[i-1] + scanner.nextLong();
		}
		scanner.close();
		//Solve
		long res = 0;
		if (a[n] %3==0) {
			long count1 = 0;
			for (int i = 1; i <= n-1; i++) {
				if (a[i] == 2*a[n]/3) res += count1;
				if (a[i] == a[n]/3) count1++;
			}
		}
		//Output
		System.out.println(res);
	}
}
