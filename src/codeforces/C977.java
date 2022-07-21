package codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * <a href = "https://codeforces.com/problemset/problem/977/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:10:28 PM -  Apr 26, 2022
 */
public class C977 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Map<Integer, Integer> m = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (m.containsKey(num)) {
				m.replace(num, m.get(num), m.get(num) + 1);
			}else {
				m.put(num, 1);
			}
		}
		scanner.close();
		
		
		int tempCount = 0;
		int tempValue;
		for (int element : m.keySet()) {
			tempValue = element;
			if (k==0) {
				System.out.println((tempValue - 1 > 0)? (tempValue - 1) : -1);
				break;
			}
			tempCount += m.get(element);
			if (tempCount == k) {
				System.out.println(tempValue);
				break;
			}
			if (tempCount > k) {
				System.out.println(-1);
				break;
			}
		}
	}
}
