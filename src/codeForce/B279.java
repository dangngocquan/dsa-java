package codeForce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B279 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		int maxCount = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			q.add(x);
			sum += x;
			while (sum > t) {
				sum -= q.poll();
			}
			maxCount = Math.max(maxCount, q.size());
		}
		scanner.close();
		//Output
		System.out.println(maxCount);
	}
}
