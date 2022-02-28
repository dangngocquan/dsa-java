package CodeForce;

import java.util.Scanner;

public class A1341 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			int x1 = (a-b)*n;
			int x2 = (a+b)*n;
			int x3 = c-d;
			int x4 = c+d;
			if ((x1 <= x3 && x4<= x2) || (x3 <= x1 && x2 <= x4)) {
				ans[i] = "Yes";
			}else if ((x1 <= x3 && x3 <= x2) || (x1 <= x4 && x4 <= x2)) {
				ans[i] = "Yes";
			}else {
				ans[i] = "No";
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
