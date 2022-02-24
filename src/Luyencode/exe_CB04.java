package Luyencode;

import java.util.Scanner;

public class exe_CB04 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		if (b==0) {
			System.out.println("INF");
		}else {
			System.out.printf("%.2f",a*1.0/b);
		}
	}
}
