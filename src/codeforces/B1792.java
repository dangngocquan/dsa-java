package codeforces;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 9:40:59 PM - Jan 24, 2023
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
			long tempValue = 0;
			long temp1 = 0;
			long temp2 = 0;
			long ans = 0;
			
			if (a1 == 0) {
				System.out.println(1);
				continue;
			}
			
			ans += a1;
			temp1 += a1;
			temp2 += a1;
			
			while ((a2 > 0 && temp2 > 0) || (a3 > 0 && temp1 > 0)) {
				tempValue = Math.min(a3, temp1);
				ans += tempValue;
				temp1 -= tempValue;
				temp2 += tempValue;
				a3 -= tempValue;
				tempValue = Math.min(a2, temp2);
				ans += tempValue;
				temp2 -= tempValue;
				temp1 += tempValue;
				a2 -= tempValue;
			}
			
			if (a4 == 0) {
				if (a3 > 0 || a2 > 0) {
					ans += 1;
					System.out.println(ans);
					continue;
				}
			}
			
			tempValue = Math.min(Math.min(temp1, a4), temp2);
			ans += tempValue;
			a4 -= tempValue;
			ans += (a4 > 0)? 1 : 0;
			
			System.out.println(ans);
		}
		scanner.close();
	}
}
