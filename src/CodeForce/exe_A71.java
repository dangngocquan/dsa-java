package CodeForce;

import java.util.Scanner;

public class exe_A71 {
	static String getChange(String s) {
		String res = s;
		int n = s.length();
		if (n > 10) {
			res = "";
			res = s.substring(0,1) + (n-2) + s.substring(n-1,n);
		}
		return res;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
			str[i] = getChange(str[i]);
		}
		scanner.close();
		//Output
		for (String i: str) {
			System.out.println(i);
		}
	}
}
