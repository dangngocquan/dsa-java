package luyenCode;

import java.math.BigInteger;
import java.util.Scanner;

public class SUMBIG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		scanner.close();
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		System.out.println(A.add(B));
	}
}
