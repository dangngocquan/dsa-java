package CodeForce;

import java.util.Scanner;

public class B1519 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			// (2*2-1 + 2*3 - 1 + ... + 2*min - 1) + (max-min)*n 
			// = 2*(2+3+...+ min) - (min-1) + (max - min)*n
			// = (min-1)*(min+2) - (min-1) + (max - min)*n
			// = (min-1)*(min+1) + (max - min) * min = min^2 - 1 + max*min - min^2
			// = max*min-1
			if (n*m - 1 == k) {
				ans[i] = "YES";
			}else {
				ans[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String  i : ans) System.out.println(i);
	}
}
