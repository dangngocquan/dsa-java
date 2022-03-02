package luyenCode;

import java.util.Scanner;

public class VT04 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		String ans = "NO";
		for (int i = 0; i < n; i++) {
			if (x == scanner.nextInt()) ans = "YES";
		}
		scanner.close();
		//Output
		System.out.println(ans);
	}
}
