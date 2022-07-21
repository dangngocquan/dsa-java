package luyencode;

import java.util.Scanner;

public class VT01 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) ans = Math.max(ans, scanner.nextInt());
		scanner.close();
		//Output
		System.out.println(ans);
	}
}
