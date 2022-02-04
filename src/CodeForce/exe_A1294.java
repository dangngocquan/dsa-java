package CodeForce;

import java.util.Scanner;

public class exe_A1294 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int n = scanner.nextInt();
			int x = a+b+c+n;
			if (x%3==0 && x/3>=Math.max(Math.max(a, b), c)) {
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
