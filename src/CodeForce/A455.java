package CodeForce;

import java.util.Scanner;

public class A455 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[100001];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			a[x] += x;
		}
		scanner.close();
		//Solve
		for (int i = 2; i < 100001; i++) {
			a[i] = Math.max(a[i-1], a[i] + a[i-2]);
		}
		//Output
		System.out.println(a[100000]);
	}
}
