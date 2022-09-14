package codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1506/problem/D"> Link </a>
 * @author Bris
 * @since 10:05:33 PM - Sep 13, 2022
 *
 */
public class D1506 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			Map<Integer, Integer> map = new LinkedHashMap<>();
			int maxCount = 0;
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				if (map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				}else {
					map.put(num,  1);
				}
				maxCount = Math.max(maxCount, map.get(num));
			}
			System.out.println((maxCount >= n - maxCount)? 2* maxCount - n : n%2);
		}
		scanner.close();
	}
}
