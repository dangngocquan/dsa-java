package CodeForce;

import java.util.Scanner;

public class exe_C1374 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			int temp = 0;
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == ')') {
					temp--;
				}else {
					temp++;
				}
				if (temp < 0) {
					res[i]++;
					temp = 0;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
