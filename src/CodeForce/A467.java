package CodeForce;

import java.util.Scanner;

public class A467 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
			q[i] = scanner.nextInt();
			if (q[i] - p[i] >= 2) res++;
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
