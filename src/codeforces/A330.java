package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/problemset/problem/330/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:04:22 PM -  Apr 13, 2022
 */
public class A330 {
	/**
	 * the main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		Set<Integer> listRowIndex = new LinkedHashSet<Integer>();
		Set<Integer> listColumnIndex = new LinkedHashSet<Integer>();
		for (int i = 0; i < row; i++) {
			String s = scanner.next();
			for (int j = 0; j < column; j++) {
				if (s.charAt(j) == 'S') {
					listRowIndex.add(i);
					listColumnIndex.add(j);
				}
			}
		}
		scanner.close();
		
		int ans = row * column - listRowIndex.size() * listColumnIndex.size();
		System.out.println(ans);
	}
}
