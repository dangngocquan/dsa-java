//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.

package other.exercise;

import java.util.*;

public class exe_0003 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tinh tong cac chu so cua 1 so tu nhien ...");
		System.out.print("Nhap so tu nhien N:\t");
		int N = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		int result = 0;
		while (N>0) {
			result += N%10;
			N /= 10;
		}
		//Output
		System.out.println("Result:\t"+result);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
