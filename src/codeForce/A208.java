package codeForce;

import java.util.Scanner;

public class A208 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = s.replaceAll("WUB", " ");
		res = res.replaceAll("\\s{2,}", " ").trim();
		//Output
		System.out.println(res);
	}
}
