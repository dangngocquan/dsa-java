package luyenCode;

import java.util.Scanner;

public class DEMTU {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		s = s.replaceAll("[a-zA-z]{1,}", "1");
		s = s.replaceAll("[ ]{1,}", "");
		System.out.println(s.length());
	}
}
