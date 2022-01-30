package CodeForce;

import java.util.Scanner;

public class exe_A118 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next().toLowerCase();
		scanner.close();
		//Solve
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x != 'u'&&x != 'e'&&x != 'o'&&x != 'a'&&x != 'i'&&x != 'y') {
				res += "." + x;
			}
		}
		//Output
		System.out.println(res);
	}
}
