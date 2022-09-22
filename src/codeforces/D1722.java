package codeforces;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1722/D"> Link </a>
 * @author Bris
 * @since 5:48:14 PM - Sep 22, 2022
 *
 */
public class D1722 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			long tempValue = 0;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == 'L') {
					tempValue += i;
				}else {
					tempValue += n-1-i;
				}
			}
			
			int indexMid = n/2;
			Queue<Integer> q = new LinkedList<>();
			for (int i = 0; i < indexMid; i++) {
				if (s.charAt(i) == 'L') {
					q.add(i);
				}
				if (s.charAt(n-1-i) == 'R') {
					q.add(n-1-i);
				}
			}
			
			for (int k = 1; k <= n; k++) {
				if (q.isEmpty()) {
					System.out.print(tempValue + " ");
				}else {
					int index = q.poll();
					if (index < indexMid) {
						tempValue += -index + (n-1-index);
					}else {
						tempValue += index - (n-1-index);
					}
					System.out.print(tempValue + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
