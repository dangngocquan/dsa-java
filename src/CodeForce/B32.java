package CodeForce;

import java.util.Scanner;

public class B32 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next() + "+";
		scanner.close();
		//Solve
		String res = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == '.') {
				res += "0";
			}else {
				if (s.charAt(i+1) == '.') {
					res += "1";
				}else {
					res += "2";
				}
				i++;
			}
		}
		//Output
		System.out.println(res);
	}
}
