//Viết chương trình liệt kê tất cả các tập con k phần tử của 1, 2, ..,n (k≤n).

package chap001.exe;

import java.util.*;

public class exe_0010_c1 {
	//Input
	static int input() {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Liet ke tat ca cac tap con k phan tu cuar 1,2,3...,n (k<=n).");
		boolean check = false;
		while (!check) {
			try {
				System.out.print("Nhap so tu nhien n (n>0):\t");
				n = Integer.parseInt(scanner.next());
				if (n<=0) throw new Exception("So n khong hop le !!!");
				check = true;
			} catch (Exception e) {
				System.out.println("So n khong hop le !!!");
			}
		}
		scanner.close();
		return n;
	}
	//Solve
	//Array to String
	static String getString(int[] arr) {
		String str = "{";
		for (int i = 1; i < arr.length; i++) {
			str += arr[i]+",";
		}
		str = str.substring(0,str.length()-1);
		return str+"}";
	}
	//BackTrack
	static void backTrack(int k, int n,boolean[] used, int[] result, List<String> list) {
		for (int i = result[k-1]+1; i <= n; i++) {
			if (used[i] == false) {
				used[i] = true;
				result[k] = i;
				if (k== result.length-1) {
					list.add(getString(result));
				}else {
					backTrack(k+1, n, used, result, list);
				}
				result[k] = 0;
				used[i] = false;
			}
		}
	}
	
	//Main
	public static void main(String[] args) {
		//Input
		int n = input();
		//Solve
		List<String> list = new ArrayList<String>();
		boolean[] used = new boolean[n+1];
		Arrays.fill(used,false);
		used[0] = true;
		//Output
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			int[] result = new int[k+1];
			backTrack(1, n, used, result, list);
			System.out.println("Co "+list.size()+ " tap con co "+k+" phan tu:");
			for (String i: list) {
				System.out.print(i+ "  ");
			}
			System.out.println();
			sum += list.size();
			list.clear();
		}
		System.out.println("Tong so tap con:\t"+sum);
	}
}
