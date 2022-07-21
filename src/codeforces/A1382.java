package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1382 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			ans[i] = "NO";
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) list.add(scanner.nextInt());
			for (int j = 0; j < m; j++) {
				int x = scanner.nextInt();
				if (list.contains(x) && ans[i].equals("NO")) {
					ans[i] = "YES\n1 "+ x;
				}
			}
		}
		scanner.close();
		//Output
		for (String i: ans) System.out.println(i);
	}
}
