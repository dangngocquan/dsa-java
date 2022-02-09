package CodeForce;

import java.util.Scanner;

public class exe_A702 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int maxLength = 1;
		int start = 1;
		int end = 1;
		int temp = scanner.nextInt();
		for (int i = 2; i <= n; i++) {
			int x = scanner.nextInt();
			if (x > temp) {
				end++;
				temp = x;
			}else {
				maxLength = Math.max(maxLength, end-start+1);
				start = i;
				end = i;
				temp = x;
			}
			if (i==n) maxLength = Math.max(maxLength, end-start+1);
		}
		scanner.close();
		//Output
		System.out.println(maxLength);
	}
}
