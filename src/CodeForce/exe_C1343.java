package CodeForce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exe_C1343 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] res = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			Queue<Long> q = new LinkedList<Long>();
			q.add(scanner.nextLong());
			for (int j = 2; j <= n; j++) {
				long x = scanner.nextLong();
				if (x*q.peek()> 0) {
					q.add(x);
				}else {
					long max = Long.MIN_VALUE;
					while (q.size()>0) {
						max = Math.max(max, q.poll());
					}
					res[i] += max;
					q.add(x);
				}
				if (j==n) {
					long max = Long.MIN_VALUE;
					while (q.size()>0) {
						max = Math.max(max,q.poll());
					}
					res[i] += max;
				}
			}
			if (q.size()>0) res[i] += q.poll();
		}
		scanner.close();
		//Output
		for (long i: res) System.out.println(i);
	}
}
