package CodeForce;

import java.util.Scanner;

public class B467 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int[] x = new int[m+1];
		for (int i = 0; i <= m; i++) x[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 0; i < m; i++) {
			String s = Integer.toBinaryString(x[i] ^ x[m]);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') count++;
			}
			if (count <= k) res++;
		}
		//Output
		System.out.println(res);
	}
}
