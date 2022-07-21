package luyencode;

import java.util.Scanner;

public class VT05 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() == x) ans++;
		}
		scanner.close();
		//Output
		System.out.println(ans);
	}
}
