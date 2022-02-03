package CodeForce;

import java.util.Scanner;

public class exe_A1551 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res1 = new int[t];
		int[] res2 = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			if (n%3==0) {
				res1[i] = n/3;
				res2[i] = n/3;
			}else if (n%3 == 1) {
				res1[i] = n/3 + 1;
				res2[i] = n/3;
			}else {
				res1[i] = n/3;
				res2[i] = n/3+1;
			}
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i ++) {
			System.out.println(res1[i] + " " + res2[i]);
		}
	}
}
