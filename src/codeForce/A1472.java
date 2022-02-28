package codeForce;

import java.util.Scanner;

public class A1472 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int n = scanner.nextInt();
			int S = w*h;
			while (w%2==0) w/=2;
			while (h%2==0) h/=2;
			if (S/(w*h)>=n) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
 	}
}
