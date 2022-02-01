package CodeForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exe_A455 {
	static int getCountOfValue(int x, int[] a) {
		int count = 0;
		for (int i : a) {
			if (i==x) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			a[i] = x;
			if (!list.contains(x)) list.add(x);
		}
		scanner.close();
		//Solve
		int res = 0;
		boolean[] isUsed = new boolean[list.size()];
		Arrays.fill(isUsed, false);
		Collections.sort(list);
		for (int i = list.size()-1; i >=0; i--) {
			if (!isUsed[i]) {
				int value = list.get(i);
				int x = getCountOfValue(value, a)*value;
				int y = 0;
				if (list.contains(value+1) && !isUsed[i+1]) y += getCountOfValue(value+1, a)*(value+1) ;
				if (list.contains(value-1) && !isUsed[i-1]) y += getCountOfValue(value-1, a)*(value-1) ;
				if (x>=y) {
					res += x;
					isUsed[i] = true;
					if (list.contains(value+1)) isUsed[i+1] = true;
					if (list.contains(value-1)) isUsed[i-1] = true;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
