package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1452/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:43:02 AM -  Jun 25, 2022
 */
public class A1452 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int[] a = new int[2];
			a[0] = scanner.nextInt();
			a[1] = scanner.nextInt();
			Arrays.sort(a);
			if (a[0] == a[1]) {
				System.out.println(2*a[0]);
			}else {
				System.out.println(2 * a[1] - 1);
			}
		}
		scanner.close();
	}
}
