package codeForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <a href =  "https://codeforces.com/problemset/problem/1497/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 7:51:53 AM -  Apr 30, 2022
 */
public class A1497 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			List<Integer> list = new ArrayList<Integer>();
			System.out.print(a[0] + " ");
			for (int i = 1; i < n; i++) {
				if (a[i] == a[i-1]) {
					list.add(a[i]);
				}else {
					System.out.print(a[i] + " ");
				}
				
			}
			for (int element : list) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
