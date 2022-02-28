package CodeForce;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class B977 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		String ans = "";
		int max = 0;
		Map<String, Integer> m = new LinkedHashMap<String,Integer>();
		for (int j = 0; j < n-1; j++) {
			String x = s.substring(j,j+2);
			if (m.containsKey(x)) {
				m.replace(x, m.get(x), m.get(x)+1);
			}else {
				m.put(x, 1);
			}
		}
		for (String x : m.keySet()) {
			if (m.get(x) > max) {
				max = m.get(x);
				ans = x;
			}
		}
		//Output
		System.out.println(ans);
	}
}
