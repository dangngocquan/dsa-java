package CodeForce;

import java.util.Scanner;

public class exe_A59 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int x = (int)(str.charAt(i));
			if (65<= x && x <= 90) {
				count++;
			}
		}
		if (count > str.length()-count) {
			res = str.toUpperCase();
		}else {
			res = str.toLowerCase();
		}
		//Output
		System.out.println(res);
	}
}
