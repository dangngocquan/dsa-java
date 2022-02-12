package CodeForce;

import java.util.Scanner;

public class exe_A1618 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int[] b = new int[7];
			for (int j = 0; j < 7; j++) b[j] = scanner.nextInt();
			ans[i] = (b[6] - b[5]) + " " + (b[6] - b[4]) + " "+ (b[4] + b[5] - b[6]);
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
