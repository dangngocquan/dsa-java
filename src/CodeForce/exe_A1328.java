package CodeForce;

import java.util.Scanner;

public class exe_A1328 {
	public static void main(String[] args) {
		//Input + Solve
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a%b==0) {
				res[i] = 0;
			}else {
				res[i] = b*(a/b+1) - a;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
