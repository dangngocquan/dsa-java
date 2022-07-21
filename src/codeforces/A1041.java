package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1041/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:21:27 PM -  Jun 7, 2022
 */
public class A1041 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(a);
		
		System.out.println(a[n-1] - a[0] + 1 - n);
	}
}
