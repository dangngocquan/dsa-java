package luyenCode;

import java.util.Scanner;

/**
 * <a href = "https://luyencode.net/problem/SUM5"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 11:30:10 PM -  Mar 31, 2022
 */
public class SUM5 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		double[] ans = new double[1000001];
		ans[0] = 0.0;
		for (int i = 1; i <= 1000000; i++) {
			ans[i] = ans[i-1] + 1.0/i;
		}
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.printf("%.5f\n", ans[n] );
		}
		scanner.close();
	}
}
