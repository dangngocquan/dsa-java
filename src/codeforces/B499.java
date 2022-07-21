package codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class B499 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Map<String, String > map = new LinkedHashMap<String, String>();
		for (int i = 1; i <= m; i++) {
			map.put(scanner.next(), scanner.next());
		}
		String res = "";
		for (int i = 1; i <= n; i++) {
			String s = scanner.next();
			if (s.length()> map.get(s).length()) {
				res += map.get(s) + " ";
			}else {
				res += s+" ";
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
