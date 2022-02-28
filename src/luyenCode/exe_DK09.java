package luyenCode;

import java.util.Scanner;

public class exe_DK09 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();
		//Solve
		String ans = "NO";
		if (year % 400 == 0 || (year % 4 ==0 && year %100 != 0)) ans = "YES";
		if (year <= 0 || year > 100000) ans = "INVALID";
		//Output
		System.out.println(ans);
	}
}
