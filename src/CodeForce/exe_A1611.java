package CodeForce;

import java.util.Scanner;

public class exe_A1611 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			if ((s.charAt(s.length()-1) - '0') %2 == 0) continue;
			if ((s.charAt(0) - '0') % 2 == 0) {
				ans[i] = 1;
				continue;
			}
			ans[i] = -1;
			for (int j = 1; j < s.length()-1; j++) {
				if ((s.charAt(j) - '0') %2==0) {
					ans[i] = 2;
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
