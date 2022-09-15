package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1593/D1"> Link </a>
 * @author Bris
 * @since 6:46:23 PM - Sep 15, 2022
 *
 */
public class D1593D1 {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	public static int gcdArr(int[] num, int indexStart, int indexEnd) {
		if (indexEnd - indexStart + 1 == 2) {
			return gcd(num[indexStart], num[indexEnd]);
		}else {
			return gcd(num[indexStart], gcdArr(num, indexStart+1, indexEnd));
		}
	}
	
	public static boolean isSameValue(int[] a) {
		if (a.length <= 1) {
			return true;
		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			int[] num = new int[n-1];
			for (int i = 0; i < n-1; i++) {
				num[i] = a[i+1] - a[0];
			}
			System.out.println(isSameValue(a)? -1 : gcdArr(num, 0, n-2));
		}
		scanner.close();
	}
}
