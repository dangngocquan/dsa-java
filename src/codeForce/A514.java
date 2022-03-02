package codeForce;

import java.util.Scanner;

public class A514 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Output
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i==0) {
				if (c != '9') {
					if ('0' + '9' - c < c) {
						System.out.print((char)('0'+('9' - c)));
					}else {
						System.out.print((char)(c));
					}
				}else {
					System.out.print(c);
				}
			}else {
				if ('0' + '9' - c < c) {
					System.out.print((char)('0'+('9' - c)));
				}else {
					System.out.print((char)(c));
				}
			}
		}
	}
}
