package CodeForce;

import java.util.Scanner;

public class exe_C1352 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			res[i] = (k/(n-1))*n;
			if (k%(n-1) == 0) {
				res[i] -= 1;
			}else {
				res[i] += k%(n-1);
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
