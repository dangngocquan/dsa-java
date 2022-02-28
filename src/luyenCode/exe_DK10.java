package luyenCode;

import java.util.Scanner;

public class exe_DK10 {
	static boolean isLeapYear(int year) {
		if (year%400 == 0 || (year %4 == 0 && year % 100 != 0)) return true;
		return false;
	}
	
	static int getDays(int month, int year) {
		int[] a = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int[] b = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		if (isLeapYear(year)) {
			return b[month];
		}
		return a[month];
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		scanner.close();
		//Solve
		if (month <= 0 || month > 12 || year <= 0 || year > 100000) {
			System.out.println("INVALID");
		}else {
			System.out.println(getDays(month, year));
		}
	}
}
