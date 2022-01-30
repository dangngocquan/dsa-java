package CodeForce;

import java.util.Scanner;

public class exe_A451 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int max = n+m -1;
		int res = 0;
		if (max %2 == 0) {
			res = max/2;
		}else {
			res = (max+1)/2;
		}
		//Output
		if (res %2 == 0) {
			System.out.println("Malvika");
		}else {
			System.out.println("Akshat");
		}
	}
}
