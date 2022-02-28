package CodeForce;

import java.util.Scanner;

public class A1367 {
	static String getResult(String s) {
		String res = "";
		res += s.charAt(0);
		if (s.length()>2) {
			for (int i = 1; i < s.length()-1; i+=2) {
				res += s.charAt(i);
			}
		}
		res += s.charAt(s.length()-1);
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			res[i] = getResult(s);
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
