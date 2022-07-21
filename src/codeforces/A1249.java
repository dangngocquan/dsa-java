package codeforces;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1249/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:55:42 PM -  Jul 16, 2022
 */
public class A1249 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while (q-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			
			Queue<Integer> queue = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				queue.add(a[i]);
			}
			
			List<Integer> tempList = new LinkedList<>();
			int ans = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 1; i <= size; i++) {
					int x = queue.poll();
					if (tempList.contains(x+1) || tempList.contains(x-1)) {
						queue.add(x);
					}else {
						tempList.add(x);
					}
				}
				tempList.clear();
				ans++;
			}
			
			System.out.println(ans);
		}
		scanner.close();
	}
}
