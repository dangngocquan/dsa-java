package CodeForce;

import java.util.Scanner;

public class B1638 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int even = 0;
			int odd = -1;
			ans[i] = "Yes";
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				if (x%2==0 && even == 0) {
					even = x;
				}else if (x%2==1 && odd == -1) {
					odd = x;
				}
				if (x%2==0) {
					if (x >= even) {
						even = x;
					}else {
						ans[i] = "No";
					}
				}else {
					if (x>= odd) {
						odd = x;
					}else {
						ans[i] = "No";
					}
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
