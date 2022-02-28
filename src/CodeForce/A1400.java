package CodeForce;

import java.util.Scanner;

public class A1400 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			ans[i] = "";
			for (int j = 0; j < n; j++) ans[i] += s.charAt(n-1);
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
