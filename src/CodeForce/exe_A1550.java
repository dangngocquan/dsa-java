package CodeForce;

import java.util.Scanner;

public class exe_A1550 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int s = scanner.nextInt();
			ans[i] = (int)Math.ceil(Math.sqrt(s));
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
