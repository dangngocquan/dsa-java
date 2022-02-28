package luyenCode;

import java.util.Scanner;

public class VL12 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = Math.abs(scanner.nextInt());
		scanner.close();
		//Output
		if (n == 0) {
			System.out.println("INF");
		}else {
			for (int i = n; i >= 1; i--) {
				if (n%i==0) System.out.print(i + " ");
			}
		}
		
	}
}
