package codeForce;

import java.util.*;

/**
 * <a href =  "https://codeforces.com/contest/1370/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 3:17:03 PM -  May 30, 2022
 */

public class B1370 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			Queue<Integer> indexOddList = new LinkedList<Integer>();
			Queue<Integer> indexEvenList = new LinkedList<Integer>();
			for (int i = 0; i < 2*n; i++) {
				int x = scanner.nextInt();
				if (x % 2 == 0) {
					indexEvenList.add(i+1);
				}else {
					indexOddList.add(i+1);
				}
			}
			
			if (indexOddList.size()  % 2 == 1 || indexEvenList.size() % 2 == 1) {
				indexOddList.poll();
				indexEvenList.poll();
			}else {
				if (!indexOddList.isEmpty()) {
					indexOddList.poll();
					indexOddList.poll();
				}else {
					indexEvenList.poll();
					indexEvenList.poll();
				}
			}
			
			while (!indexOddList.isEmpty()) {
				System.out.println(indexOddList.poll() + " " + indexOddList.poll());
			}
			
			while (!indexEvenList.isEmpty()) {
				System.out.println(indexEvenList.poll() + " " + indexEvenList.poll());
			}
		}
		scanner.close();
	}
}
