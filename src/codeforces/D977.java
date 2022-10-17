package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/977/D"> Link </a>
 * @author Bris
 * @since 8:53:40 PM - Oct 10, 2022
 *
 */
public class D977 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Long> list = new LinkedList<>();
		List<Long> a = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextLong());
		}
		list.add(a.get(0));
		a.remove(0);
		while (list.size() < n) {
			long head = list.get(0);
			long tail = list.get(list.size()-1);
			for (long x : a) {
				if (x*2 == head || head*3 == x) {
					list.add(0, x);
					break;
				}else if (x*3 == tail || tail*2 == x) {
					list.add(x);
					break;
				}
			}
		}
		for (long x : list) {
			System.out.print(x + " ");
		}
		scanner.close();
		
	}
}
