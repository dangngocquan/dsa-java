package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/567/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:41:20 AM -  Jun 27, 2022
 */
public class C567 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); 
		long k = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		scanner.close();
		
		long ans = 0;
		Map<Long, Long> m1 = new HashMap<>();
		Map<Long, Long> m2 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (a[i] % k == 0) {
				if (m2.containsKey(a[i] / k) ) {
					ans += m2.get(a[i] / k);
				}
				if (m1.containsKey(a[i] / k)) {
					if (m2.containsKey(a[i])) {
						m2.put(a[i], m2.get(a[i]) + m1.get(a[i] / k));
					}else {
						m2.put(a[i], m1.get(a[i] / k));
					}
				}
			}
			if (m1.containsKey(a[i])) {
				m1.put(a[i], m1.get(a[i]) + 1);
			}else {
				m1.put(a[i], Long.valueOf(1));
			}
		}
		System.out.println(ans);	
	}
}
