package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * This class is used to solve B1358 problem in codeforce.
 * The link of this problem is <a href = https://codeforces.com/problemset/problem/1358/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:29:53 PM -  Mar 19, 2022
 */
public class B1358 {
	/**
	 * 
	 * This method is used to get the maximum number of grannies.
	 * 
	 * @param n is the number of grannies.
	 * @param scanner is a Scanner variable.
	 * @return Return the maximum number of grannies.
	 */
	public static int getMaximumNumberOfGrannies(int n, Scanner scanner) {
		int max = n+1;
		// key - is a[i]
		// value - is the number of value that equal to a[i]
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			if (map.containsKey(x)) {
				map.replace(x, map.get(x), map.get(x) + 1);
			}else {
				map.put(x, 1);
			}
		}
		List<Integer> keyList = new ArrayList<>();
		for (int i : map.keySet()) {
			keyList.add(i);
		}
		for (int i = keyList.size() - 1; i >= 0; i--) {
			int x = map.get(keyList.get(i));
			if (max - 1 >= keyList.get(i)) {
				break;
			}else {
				max -= x;
			}
		}
		return max;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.println(getMaximumNumberOfGrannies(n, scanner));
		}
		scanner.close();
	}
}
