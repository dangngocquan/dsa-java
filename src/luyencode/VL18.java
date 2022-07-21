package luyencode;

import java.util.Scanner;

public class VL18 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		scanner.close();
		//Output
		boolean isStart = false;
		for (int i = n.length() - 1; i >= 0; i--) {
			if (n.charAt(i) != '0') isStart = true;
			if (isStart) System.out.print(n.charAt(i));
		}
	}
}
