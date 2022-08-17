package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1433/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 4:58:54 PM -  Aug 17, 2022
 */
public class D1433 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int value1 = 0;
			int index1 = 0;
			int index2 = -1;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (i == 0) {
					value1 = a[i];
				}else {
					if (a[i] != value1 && index2 == -1) {
						index2 = i;
					}
				}	
			}
			if (index2 == -1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				for (int i = 1; i < n; i++) {
					if (a[i] == value1) {
						System.out.println((index2 + 1) + " " + (i+1));
					}else {
						System.out.println((index1 + 1) + " " + (i+1));
					}
				}
			}
		}
		scanner.close();
	}
}
