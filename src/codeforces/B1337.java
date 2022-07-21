package codeforces;

import java.util.Scanner;

public class B1337 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int h = scanner.nextInt();
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			while (n>0) {
				if (h<=20) break;
				h = h/2 + 10;
				n--;
			}
			if (h<= m*10) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i: res) System.out.println(i);
	}
}
