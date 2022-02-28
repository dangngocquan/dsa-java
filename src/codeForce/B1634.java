package codeForce;

import java.util.Scanner;

public class B1634 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			for (int j = 0; j < n; j++) x += scanner.nextLong();
			if ((x-y)%2==0) {
				res[i] = "Alice";
			}else {
				res[i] = "Bob";
			}
		}
		scanner.close();
		//Output
		for (String i: res) System.out.println(i);
	}
}
