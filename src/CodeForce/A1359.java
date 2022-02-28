package CodeForce;

import java.util.Scanner;

public class A1359 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			int maxCard = n/k;
			if (m <= maxCard) {
				ans[i] = m;
			}else {
				ans[i] = maxCard - (int)Math.ceil((m-maxCard)*1.0/(k-1));
				if (ans[i] < 0) ans[i] = 0;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
