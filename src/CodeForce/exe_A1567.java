package CodeForce;

import java.util.Scanner;

public class exe_A1567 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			ans[i] = "";
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == 'U') {
					ans[i] += "D";
					continue;
				}else if (s.charAt(j) == 'D') {
					ans[i] += "U";
					continue;
				}
				ans[i] += s.charAt(j);
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
