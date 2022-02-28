package CodeForce;

import java.util.Scanner;

public class A1535 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			if (Math.max(a, b) > Math.min(c, d) && Math.min(a, b) < Math.max(c, d)) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
