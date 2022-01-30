package CodeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class exe_A271 {
	static boolean isDistinctDigitsNumber(int n) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (n > 0) {
			set.add(n%10);
			n /= 10;
		}
		boolean res = true;
		if (set.size() < 4) res = false;
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int res = n+1;
		while (!isDistinctDigitsNumber(res)) {
			res++;
		}
		//Output
		System.out.println(res);
		
	}
}
