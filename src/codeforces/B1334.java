package codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/1334/B"> Link </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:07:19 PM -  Mar 30, 2022
 */
public class B1334 {
	/**
	 * 
	 * The main method.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			long x = scanner.nextLong();
			Long[] a = new Long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}
			
			Arrays.sort(a, Collections.reverseOrder());
			int i;
			long sum = 0;
			for (i = 0; i < n; i++) {
				sum += a[i];
				if (sum*1.0/(i+1) < x) {
					break;
				}
			}
			System.out.println(i);
		}
		scanner.close();
	}
}
