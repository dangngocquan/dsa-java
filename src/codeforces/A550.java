package codeforces;

import java.util.Scanner;

public class A550 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		int x = s.indexOf("AB");
		if (x==-1) {
			res = "NO";
		}else {
			int y = Math.max(s.substring(0,x).indexOf("BA"), s.substring(x+2).indexOf("BA"));
			if (y == -1) {
				res = "NO";
			}else {
				res = "YES";
			}
		}
		if (res.equals("NO")) {
			int y = s.indexOf("BA");
			if (y==-1) {
				res = "NO";
			}else {
				x = Math.max(s.substring(0,y).indexOf("AB"), s.substring(y+2).indexOf("AB"));
				if (x == -1) {
					res = "NO";
				}else {
					res = "YES";
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
