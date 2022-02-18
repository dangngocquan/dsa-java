package CodeForce;

import java.util.Scanner;

public class exe_B1359 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			for (int j = 1; j <= n; j++) {
				String s = scanner.next();
				if (2*x<= y) {
					for (int k = 0; k <= m-1; k++) {
						if (s.charAt(k) == '.') ans[i] += x;
					}
					continue;
				}
				for (int k = 0; k <= m-1; k++) {
					if (k== m-1) {
						if (s.charAt(k) == '.') ans[i]+= x;
					}else {
						if (s.charAt(k) == '.') {
							if (s.charAt(k+1) == '.') {
								ans[i] += y;
								k++;
							}else {
								ans[i] += x;
								k++;
							}
						}
					}
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
