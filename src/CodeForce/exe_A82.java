package CodeForce;

import java.util.Scanner;

public class exe_A82 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		String ans = "";
		for (int i = 0; i <31; i++) {
			long x = (long)Math.pow(2,i)*5;
			if (n>x) {
				n -= x;
			}else {
				if (n>4*x/5) {
					ans = "Howard";
					break;
				}
				if (n>3*x/5) {
					ans = "Rajesh";
					break;
				}
				if (n>2*x/5) {
					ans = "Penny";
					break;
				}
				if (n>x/5) {
					ans = "Leonard";
					break;
				}
				ans = "Sheldon";
				break;
			}
		}
		//Output
		System.out.println(ans);
	}
}
