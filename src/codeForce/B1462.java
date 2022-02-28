package codeForce;

import java.util.Scanner;

public class B1462 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			ans[i] = "NO";
			String s1 = "2020";
			for (int j = 4; j >= 0; j--) {
				if (s.substring(0,j).equals(s1.substring(0,j)) &&  s.substring(n+j-4).equals(s1.substring(j))) {
					ans[i] = "YES";
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
