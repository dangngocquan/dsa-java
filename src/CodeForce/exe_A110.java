package CodeForce;

import java.util.Scanner;

public class exe_A110 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		String res = "YES";
		int count = 0;
		while (n>0) {
			if (n%10 == 4 || n %10 == 7) {
				count ++;
			}
			n /= 10;
		}
		if (count !=4 && count != 7) res = "NO";
		//Output
		System.out.println(res);
	}
}
