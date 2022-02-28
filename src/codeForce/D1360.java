package codeForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D1360 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j <= Math.min(k, Math.sqrt(n)); j++) {
				if (n%j == 0) {
					list.add(j);
					if (n/j <= k) list.add(n/j);
				}
			}
			Collections.sort(list);
			ans[i] = n/(list.get(list.size()-1));
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
