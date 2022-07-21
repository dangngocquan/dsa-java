package luyencode;

import java.util.Scanner;

public class VL08 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		a = (a%2==0)? a:a+1;
		b = (b%2==0)? b:b-1;
		int ans = ((b-a)/2+1)*(a+b)/2;
		//Output
		System.out.println(ans);
	}
}
