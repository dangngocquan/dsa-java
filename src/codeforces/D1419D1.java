package codeforces;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1419/D1"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:57:22 PM -  Aug 15, 2022
 */
public class D1419D1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		for (int i = 0; i < (n+1)/2 -1; i++) {
			list1.add(a[i]);
		}
		for (int i = (n+1)/2 -1; i < n; i++) {
			list2.add(a[i]);
		}
		System.out.println((n+1) / 2 - 1);
		while (list1.size() > 0) {
			System.out.print(list2.get(0) + " " + list1.get(0) + " ");
			list2.remove(0);
			list1.remove(0);
		}
		while (list2.size() > 0) {
			System.out.print(list2.get(0) + " ");
			list2.remove(0);
		}
		scanner.close();
	}
}
