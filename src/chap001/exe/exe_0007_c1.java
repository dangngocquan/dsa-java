//Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. Hãy viết chương trình tìm số Fibonacci thứ n.

package chap001.exe;

import java.util.*;

public class exe_0007_c1 {
	public static void main(String[] args) {
		//Input
		System.out.println("Tim so Fibonacci thu n ...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so n (n>0):\t");
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		long result = 1;
		long[] arr = new long[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		if (n>2) {
			for (long i = 3; i <= n; i++) {
				long x = arr[1] + arr[2];
				arr[0] = arr[1];
				arr[1] = arr[2];
				arr[2] = x;
			}
		}
		result = arr[2];
		//Output
		System.out.println("Result:\t" + result);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
