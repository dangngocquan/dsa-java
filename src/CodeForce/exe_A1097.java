package CodeForce;

import java.util.Scanner;

public class exe_A1097 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char s1 = s.charAt(0);
		char s2 = s.charAt(1);
		String res = "NO";
		for (int i = 1; i <= 5; i++) {
			String x = scanner.next();
			if (x.charAt(0) == s1 || x.charAt(1) == s2) res = "YES";
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
