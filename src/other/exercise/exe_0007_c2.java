//Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. Hãy viết chương trình tìm số Fibonacci thứ n.

package other.exercise;

import java.util.*;

public class exe_0007_c2 {
	public static void main(String[] args) {
		//Input
		System.out.println("Tim so Fibonacci thu n ...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so n (n>0):\t");
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		double result = 1;
		double a = (1.0 + Math.sqrt(5)) / 2;
		double b = (1.0 - Math.sqrt(5)) / 2;
		result = (Math.pow(a,n) - Math.pow(b,n))/(Math.sqrt(5));
		//Output
		System.out.println("Resultt:\t" + (long)result);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
//2147483647