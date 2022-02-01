package CodeForce;

import java.util.Scanner;

public class exe_C1633 {
	static String getResult(long hC, long dC, long hM, long dM, long k, long w, long a) {
		String s = "NO";
		for (long i = 0; i <= k; i++) {
			if (canWin(hC+i*a, dC+(k-i)*w, hM, dM)) {
				s = "YES";
				break;
			}
		}
		return s;
	}
	
	static boolean canWin(long hC, long dC, long hM, long dM) {
		boolean check = false;
		if (Math.ceil(hC*1.0/dM) >= Math.ceil(hM*1.0/dC)) check = true;
		return check;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			long hC = scanner.nextLong();
			long dC = scanner.nextLong();
			long hM = scanner.nextLong();
			long dM = scanner.nextLong();
			long k = scanner.nextLong();
			long w = scanner.nextLong();
			long a = scanner.nextLong();
			res[i] = getResult(hC, dC, hM, dM, k, w, a);
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
