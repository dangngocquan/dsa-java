package codeForce;

import java.util.Scanner;

public class A96 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		char[] arr = s.toCharArray();
		String isDangerous = "NO";
		int count = 0;
		char temp = arr[0];
		for (char i: arr) {
			if (i== temp) {
				count++;
			}else {
				count = 1;
				temp = i;
			}
			if (count >= 7) {
				isDangerous = "YES";
				break;
			}
		}
		//Output
		System.out.println(isDangerous);
	}
}
