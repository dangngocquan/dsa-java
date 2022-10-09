package codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1353/D"> Link </a>
 * @author Bris
 * @since 10:58:39 PM - Sep 29, 2022
 *
 */
public class D1353 {
	public static class Pair implements Comparable<Pair>{
		int l;
		int r;
		int mid;
		int length;
		
		public Pair(int l, int r) {
			this.l = l;
			this.r = r;
			this.length = r - l +1;
			this.mid = (l + r)/2;
		}
		
		@Override
		public int compareTo(Pair other) {
			if (this.length == other.length) {
				return this.l - other.l;
			}
			return other.length - this.length;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder s = new StringBuilder();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] ans = new int[n+1];
			PriorityQueue<Pair> q = new PriorityQueue<>();
			q.add(new Pair(1, n));
			int tempValue = 1;
			while (!q.isEmpty()) {
				Pair pair = q.poll();
				if (pair.length <= 0) {
					continue;
				}
				ans[pair.mid] = tempValue++;
				q.add(new Pair(pair.l, pair.mid - 1));
				q.add(new Pair(pair.mid + 1, pair.r));
			}
			for (int i = 1; i <= n; i++) {
				s.append(ans[i] + " ");
			}
			s.append("\n");
		}
		System.out.println(s);
		scanner.close();
	}
}

