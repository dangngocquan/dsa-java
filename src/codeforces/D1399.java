package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1399/problem/D"> Link </a>
 * @author Bris
 * @since 7:16:47 PM - Sep 21, 2022
 *
 */
public class D1399 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			Queue<Integer> q0 = new LinkedList<>();
			Queue<Integer> q1 = new LinkedList<>();
			List<Integer> groups = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '0') {
					if (q1.isEmpty()) {
						q0.add(q0.size() + 1);
						groups.add(q0.size());
					}else {
						groups.add(q1.peek());
						q0.add(q1.poll());
					}
				}else {
					if (q0.isEmpty()) {
						q1.add(q1.size() + 1);
						groups.add(q1.size());
					}else {
						groups.add(q0.peek());
						q1.add(q0.poll());
					}
				}
			}
			System.out.println(q1.size() + q0.size());
			for (int group: groups) {
				System.out.print(group + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
