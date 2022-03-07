//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//	Ví dụ: Số 28 được phân tích thành 2 x 2 x 7


package other.exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class exe_0004 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Phan tich 1 so ra cac thua so nguyen to...");
		System.out.print("Nhap so tu nhien can phan tich:\t");
		int N = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> list = new ArrayList<Integer>();
		String result = N + " = ";
		for (int i = 2; i <= N; i++) {
			while (N%i == 0) {
				list.add(i);
				N /= i;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				result += list.get(i);
			}else {
				result += " x " + list.get(i);
			}
		}
		//Output
		System.out.println(result);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
