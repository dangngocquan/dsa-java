package CodeForce;

import java.util.Scanner;

public class B1560 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int k = Math.abs(a-b);
			int max = 2*k;
			if (a>max || b>max || c> max) {
				res[i] = -1;
			}else {
				if (c<=k) {
					res[i] = c+k;
				}else {
					res[i] = c-k;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
