package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1712/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:49:13 PM -  Aug 13, 2022
 */
public class C1712 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] count = new int[100001];
			Set<Integer> s = new LinkedHashSet<>();
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				count[a[i]]++;
				s.add(a[i]);
			}
			int ans = s.size();
			int temp = a[n-1];
			for (int i = a.length - 1; i >= 0; i--) {
				if (a[i] > temp) {
					break;
				}else if (a[i] == temp) {
					count[temp]--;
					if (count[temp] == 0) {
						ans--;
					}
				}else {
					if (count[temp] > 0) {
						break;
					}else {
						temp = a[i];
						count[a[i]]--;
						if (count[temp] == 0) {
							ans--;
						}
					}
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
