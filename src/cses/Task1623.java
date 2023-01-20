package cses;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 8:51:33 PM - Jan 20, 2023
 *
 */
public class Task1623 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int tempCount = 2;
		Queue<Long> q = new LinkedList<>();
		long ans = 1000000000;
		long num = scanner.nextLong();
		n--;
		q.add(num);
		q.add(-num);
		if (n == 0) {
			ans = num;
		}
		while (!q.isEmpty() && n-- > 0) {
			num = scanner.nextLong();
			for (int i = 0; i < tempCount; i++) {
				long pollNum = q.poll();
				q.add(pollNum + num);
				q.add(pollNum - num);
				if (n == 0) {
					long val = Math.min(Math.abs(pollNum+ num) , Math.abs(pollNum - num));
					ans = Math.min(ans, val);
				}
			}
			tempCount = tempCount << 1;
		}
		System.out.println(ans);
		scanner.close();
	}
}
