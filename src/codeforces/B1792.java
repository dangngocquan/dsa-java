package codeforces;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 12:14:53 PM - Jan 26, 2023
 *
 */
public class B1792 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a1 = scanner.nextLong();
			long a2 = scanner.nextLong();
			long a3 = scanner.nextLong();
			long a4 = scanner.nextLong();
			long ans = a1;
			long temp1 = a1;
			long temp2 = a1;
			if (ans > 0) {
				long tempValue = Math.min(a2, a3);
				ans += 2 * tempValue;
				a2 -= tempValue;
				a3 -= tempValue;
				tempValue = 0;
				if (a2 > 0) {
					tempValue = a2;
				}else if (a3 > 0) {
					tempValue = a3;
				}
				tempValue = Math.min(tempValue, a1);
				ans += tempValue;
				if (a2 > 0) {
					a2 -= tempValue;
					temp2 -= tempValue;
				}else if (a3 > 0) {
					a3 -= tempValue;
					temp1 -= tempValue;
				}
				if (a2 > 0 || a3 > 0) {
					ans += 1;
				}else {
					tempValue = 0;
					tempValue = Math.min(Math.min(temp1, temp2), a4);
					a4 -= tempValue;
					ans += tempValue;
					if (a4 > 0) {
						ans++;
					}
				}	
			}else {
				ans = 1;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
