package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1614/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:31:39 AM -  Jun 25, 2022
 */
public class A1614 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n =  scanner.nextInt();
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int k = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt(); 
			}
			Arrays.sort(a);
			int ans = 0;
			for (int i : a) {
				if (i > r) {
					break;
				}
				if (i >= l) {
					if (k >= i) {
						ans++;
						k -= i;
					}else {
						break;
					}
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
