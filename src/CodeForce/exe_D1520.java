package CodeForce;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class exe_D1520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();		
			// a[j] - a[i] == j - i <=> a[j] - j == a[i]-i
			Map<Long, Long> m = new LinkedHashMap<Long,Long>();
			for (long j = 1; j <= n; j++) {
				long x = scanner.nextLong();
				if (m.containsKey(x-j)) {
					m.replace(x-j, m.get(x-j), m.get(x-j) + 1);
				}else {
					m.put(x-j, (long)1);
				}
			}
			for (long j : m.keySet()) {
				long x = m.get(j);
				ans[i] += x*(x-1)/2;
			}
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
