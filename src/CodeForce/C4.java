package CodeForce;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C4 {
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
