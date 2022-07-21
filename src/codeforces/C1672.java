package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1672/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:52:13 PM -  Apr 23, 2022
 */
public class C1672 {
	/**
	 * The main
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int index = -1;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n-1; i++) {
				if (a[i] == a[i+1]) {
					index = i;
					break;
				}
			}
			int index1 = index;
			for (int i = index+1; i < n-1; i++) {
				if (a[i] == a[i+1]) {
					index1 = i;
				}
			}
			if (index1 > index) {
				if (index1 == index+1) {
					System.out.println(1);
				}else {
					System.out.println(index1 - index -1);
				}
			}else {
				System.out.println(0);
			}
		}
		scanner.close();
	}
}
