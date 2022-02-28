package CodeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class C1335 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0 ; i < t ; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			Set<Integer> set = new LinkedHashSet<Integer>();
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				a[x]++;
				set.add(x);
			}
			int max = Integer.MIN_VALUE;
			for (int j : a) max = Math.max(max, j);
			if (n>1) {
				if (max == set.size()) {
					res[i] = max-1;
				}else {
					res[i] = Math.min(max, set.size());
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
