package CodeForce;

import java.util.Scanner;

public class exe_A509 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int[][] a = new int[n+1][n+1];
		for (int i = 1; i <= n; i++) {
			a[1][i] = 1;
			a[i][1] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= n; j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			}
		}
		//Output
		System.out.println(a[n][n]);
	}
}
