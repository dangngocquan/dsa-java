package CodeForce;

import java.util.Scanner;

public class A69 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		String res = "YES";
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += a[i];
			sum2 += b[i];
			sum3 += c[i];
		}
		if (sum1 != 0 || sum2 != 0 || sum3 != 0) {
			res = "NO";
		}
		//Output
		System.out.println(res);
	}
}
