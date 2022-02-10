package CodeForce;

import java.util.Scanner;

public class exe_A540 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		//Solve
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = Math.abs(s1.charAt(i) - s2.charAt(i));
			if (x >= 5) {
				ans += (10-x);
			}else {
				ans += x;
			}
		}
		//Output
		System.out.println(ans);
	}
}
