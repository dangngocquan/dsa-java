package CodeForce;

import java.util.Scanner;

public class A1030 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String res = "EASY";
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() == 1) res = "HARD";
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
