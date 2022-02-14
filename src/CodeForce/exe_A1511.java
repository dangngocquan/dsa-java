package CodeForce;

import java.util.Scanner;

public class exe_A1511 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x==1 || x == 3) ans[i]++;
			}
		}
		scanner.close();
		//Output
		for (int i : ans ) System.out.println(i);
	}
}
