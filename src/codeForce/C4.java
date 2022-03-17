package codeForce;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * This class is uses to solve C4 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/4/C"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:51:28 PM -  Mar 17, 2022
 */
public class C4 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < n ; i++) {
			String x = scanner.next();
			if (map.keySet().contains(x)) {
				res.add(x+map.get(x));
				map.replace(x, map.get(x), map.get(x)+1);
			}else {
				res.add("OK");
				map.put(x, 1);
			}
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
