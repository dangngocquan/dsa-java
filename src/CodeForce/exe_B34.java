package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_B34 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int maxSum = 0;
		Arrays.sort(a);
		for (int i = 0; i < m; i++) {
			if (a[i] >= 0) break;
			maxSum -= a[i];
		}
		//Output
		System.out.println(maxSum);
	}
}
