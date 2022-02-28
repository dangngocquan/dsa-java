package CodeForce;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class B1325 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			Set<Integer> set = new TreeSet<Integer>();
			int n = scanner.nextInt();
			for (int j = 1; j <= n; j++) set.add(scanner.nextInt());
			res[i] = set.size();
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
