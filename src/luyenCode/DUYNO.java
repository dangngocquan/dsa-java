package luyenCode;

import java.util.Scanner;

public class DUYNO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
