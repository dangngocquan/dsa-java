//Viết chương trình liệt kê tất cả các hoán vị của 1, 2, .., n.

package other.exercise;

import java.util.*;

public class exe_0011 {
	// Array to String
	static String getString(int[] result) {
		String str = "{";
		for (int i: result) {
			str += i+",";
		}
		str = str.substring(0,str.length()-1);
		return str+"}";
	}
	
	//backTrack
	static void backTrack(int k, int n, boolean[] used, int[] result, List<String> list) {
		for (int i = 1; i <= n; i++) {
			if (used[i] == false) {
				used[i] = true;
				result[k-1] = i;
				if (k==n) {
					list.add(getString(result));
				}else {
					backTrack(k+1, n, used, result, list);
				}
				result[k-1] = 0;
				used[i] = false;
			}
		}
	}
	
	//Main
	public static void main(String[] args) {
		//Input
		System.out.println("Chuong trinh liet ke tat ca cac hoan vi cua 1, 2, ..., n");
		System.out.print("Nhap so n:\t");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<String> list = new ArrayList<String>();
		int[] result = new int[n];
		boolean[] used = new boolean[n+1];
		Arrays.fill(used, false);
		used[0] = true;
		backTrack(1, n, used, result, list);
		//Output
		for (int i = 0; i <= list.size()-1; i++) {
			if (i%(list.size()/n)==0) {
				System.out.println();
			}
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		System.out.println("Count:\t"+list.size());
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
