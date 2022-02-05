package CodeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exe_A1462 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j <= n; j++) list.add(scanner.nextInt());
			res[i] = "";
			while (n>0) {
				res[i] += list.get(0)+" ";
				list.remove(0);
				n--;
				if (n>0) {
					res[i] += list.get(n-1) + " ";
					list.remove(n-1);
					n--;
				}
			}
		}
		scanner.close();
		//Output
		for (String s: res) System.out.println(s);
	}
}
