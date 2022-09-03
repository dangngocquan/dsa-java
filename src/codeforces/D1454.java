package codeforces;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1454/D"> Link </a>
 * @author Bris
 * @since 6:07:54 AM - Sep 3, 2022
 *
 */
public class D1454 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextLong();
			Map<Long, Long> map = new LinkedHashMap<>();
			long k = 0;
			for (long i = 2; i <= Math.sqrt(n); i++) {
				while (n % i == 0) {
					if (map.containsKey(i)) {
						map.put(i, map.get(i) + 1);
					}else {
						map.put(i, (long)1);
					}
					k = Math.max(k, map.get(i));
					n /= i;
				}
			}
			if (n > 1) {
				if (map.containsKey(n)) {
					map.put(n, map.get(n) + 1);
				}else {
					map.put(n, (long)1);
				}
				k = Math.max(k, map.get(n));
			}
			

			List<Long> list = new LinkedList<>();
			long turn = 1;
			while (turn <= k) {
				long num = 1;
				for (long key : map.keySet()) {
					if (map.get(key) >= turn) {
						num *= key;
					}
				}
				list.add(num);
				turn++;
			}
			System.out.println(k);
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
