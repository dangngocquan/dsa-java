package codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1374/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:33:46 PM -  Aug 15, 2022
 */
public class D1374 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			Map<Long, Long> m = new LinkedHashMap<>();
			long maxCount = 0;
			long maxMod = 0;
			for (int i = 0; i < n; i++) {
				long num = scanner.nextLong();
				long modAdd = k - num%k;
				if (modAdd != k) {
					if (m.keySet().contains(modAdd)) {
						m.put(modAdd, m.get(modAdd) + 1);
					}else {
						m.put(modAdd, (long)1);
					}
					if (m.get(modAdd) == maxCount) {
						if (modAdd >= maxMod) {
							maxMod = modAdd;
						}
					}else if (m.get(modAdd) > maxCount) {
						maxCount = m.get(modAdd);
						maxMod = modAdd;
					}
				}
			}
			if (maxCount == 0) {
				System.out.println(0);
			}else {
				System.out.println((maxCount - 1) * k + maxMod + 1);
			}
			
		}
		scanner.close();
	}
}
