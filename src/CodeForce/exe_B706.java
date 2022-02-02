package CodeForce;

import java.util.Scanner;

public class exe_B706 {	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[100001];
		for (int i = 1; i <= n; i++) {
			a[scanner.nextInt()] += 1;
		}
		int q = scanner.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = scanner.nextInt();
			if (m[i] > 100000) m[i] = 100000;
		}
		scanner.close();
		//Solve
		for (int i = 1; i <= 100000; i++) {
			a[i] += a[i-1];
		}
		//Output
		for (int i : m) {
			System.out.println(a[i]);
		}
	}
}
