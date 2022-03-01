package luyenCode;

import java.util.Scanner;

public class VL17 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = Math.abs(scanner.nextInt());
		scanner.close();
		//Solve
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			while (n %i==0) {
				n /= i;
				count++;
			}
			ans *= (count+1);
		}
		//Output
		System.out.println(ans);
	}
}
