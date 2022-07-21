package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1525/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:35:00 AM -  Jun 25, 2022
 */
public class B1525 {
	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
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
			if (isSorted(a)) {
				System.out.println(0);
			}else {
				if (a[0] == 1 || a[n-1] == n) {
					System.out.println(1);
				}else if (a[0] == n && a[n-1] == 1){
					System.out.println(3);
				}else {
					System.out.println(2);
				}
			}
		}
		scanner.close();
	}
}
