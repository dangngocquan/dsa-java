package CodeForce;

import java.util.Scanner;

public class exe_A1633 {
	static int getResult(int n) {
		int res = n;
		if (n%7!=0) {
			int i = n%10;
			int j = n%7;
			if (i>=j) {
				res = n-j;
			}else {
				res = res + 7-j;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res[i] = getResult(n);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
