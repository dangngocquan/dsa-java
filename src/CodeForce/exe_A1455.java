package CodeForce;

import java.util.Scanner;

public class exe_A1455 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			ans[i] = scanner.next().length();
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
