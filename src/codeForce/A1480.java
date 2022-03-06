package codeForce;

import java.util.Scanner;

public class A1480 {
	public static void main(String[] args) {
		//Input + Output
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (i%2 == 0) {
					if (c == 'a') {
						System.out.print("b");
					}else {
						System.out.print("a");
					}
				}else {
					if (c == 'z') {
						System.out.print("y");
					}else {
						System.out.print("z");
					}
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
