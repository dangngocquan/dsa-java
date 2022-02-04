package CodeForce;

import java.util.Scanner;

public class exe_A1353 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n==1) {
				res[i] = 0;
			}else if (n == 2) {
				res[i] = m;
			}else {
				res[i] = 2*m;
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
