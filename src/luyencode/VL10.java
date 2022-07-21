package luyencode;

import java.util.Scanner;

public class VL10 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		scanner.close();
		//Output
		if (n.charAt(0)== '-') {
			System.out.println(n.length()-1);
		}else {
			System.out.println(n.length());
		}
	}
}
