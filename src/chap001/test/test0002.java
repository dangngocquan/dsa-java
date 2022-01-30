// Liet ke cac hoan vi cua n chu so

package chap001.test;

import java.util.*;

public class test0002 {
	static int[] arr;
	static boolean[] used;
	static List<String> result;
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n:\t");
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		used = new boolean[n+1];
		Arrays.fill(used, false);
		used[0] = true;
		arr = new int[n+1];
		result = new ArrayList<String>();
		backTrack(1, n);
		for (String i: result) {
			System.out.println(i);
		}
		
	}
	
	static void backTrack(int k, int n) {
		for (int i=1; i <= arr.length - 1; i++) {
			if (used[i] == false) {
				used[i] = true;
				arr[k] = i;
				if (k==n) {
					String str = "";
					for (int j: arr) {
						str += i=j;
					}
					result.add(str);
				}else {
					backTrack(k+1, n);
				}
				used[i] = false;
			}
		}
	}
}
