package CodeForce;

import java.util.Scanner;

public class exe_A61 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		for (int i = 0; i <s1.length(); i++ ) {
			if (s1.charAt(i) == s2.charAt(i)) {
				res += "0";
			}else {
				res += "1";
			}
		}
		//Output
		System.out.println(res);
	}
}
