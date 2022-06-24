package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1348/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:56:08 AM -  Jun 25, 2022
 */
public class B1348 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			Set<Integer> set = new LinkedHashSet<>();
			for (int i = 0; i < n; i++) {
				set.add(scanner.nextInt());
			}
			
			if (set.size() > k) {
				System.out.println(-1);
				continue;
			}else if (set.size() < k){
				for (int i = 1; i <= n; i++) {
					set.add(i);
					if (set.size() == k) {
						break;
					}
				}
			}
			
			String s = "";
			for (int i: set) {
				s += i + " ";
			}
			System.out.println(k * n);
			for (int i = 1; i <= n; i++) {
				System.out.print(s);
			}
			System.out.println();
		}
		scanner.close();
	}
}
