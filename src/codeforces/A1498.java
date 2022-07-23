package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1498/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:25:19 AM -  Jul 23, 2022
 */
public class A1498 {
	public static long sumDigits(long n) {
		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	public static long gcdSum(long n) {
		return gcd(n, sumDigits(n));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextLong();
			long ans = -1;
			while (ans == -1) {
				if (n % 3 == 0 || (n % 2 == 0 && sumDigits(n) % 2 == 0) || gcdSum(n) > 1) {
					ans = n;
				}else {
					n++;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
