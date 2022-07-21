package luyencode;

import java.util.Scanner;

public class DK05 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Output
		String ans = "NO";
		if (n>=0) {
			if(Math.pow(Math.round(Math.sqrt(n)),2) == n) ans = "YES";
		}
		
		System.out.println(ans);
	}
}
