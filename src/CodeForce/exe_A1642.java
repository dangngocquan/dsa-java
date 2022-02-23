package CodeForce;

import java.util.Scanner;

public class exe_A1642 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		double[] ans = new double[t];
		for (int i = 0; i < t; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int x3 = scanner.nextInt();
			int y3 = scanner.nextInt();
			int max = Math.max(Math.max(y1, y2), y3);
			ans[i] = 0;
			if (y1==y2 && y2==max) {
				ans[i] = Math.abs(x1-x2);
			}else if (y1==y3 && y3 == max) {
				ans[i] = Math.abs(x1-x3);
			}else if (y2==y3 && y3==max) {
				ans[i] = Math.abs(x2-x3);
			}
		}
		scanner.close();
		//Output
		for (double i : ans) System.out.println(i);
	}
}
