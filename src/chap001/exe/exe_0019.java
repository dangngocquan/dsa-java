//Viết chương trình liệt kê tất cả các số nguyên tố có 5 chữ số sao cho tổng của các chữ số trong mỗi số nguyên tố đều bằng S cho trước.

package chap001.exe;

import java.util.*;

public class exe_0019 {
	static int getSum(int x) {
		int res = 0;
		while (x >0) {
			res += (x%10);
			x /= 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap S = ");
		int S = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(2);
		for (int i=3; i<100000;i++) {
			boolean check = true;
			int x = (int)Math.sqrt(i);
			for (int j: list1) {
				if (j>x) {
					break;
				}
				if(i%j==0) {
					check = false;
					break;
				}
			}
			if(check) {
				list1.add(i);
				if (10000<=i && i<100000 && getSum(i)==S) {
					list2.add(i);
				}
			}
		}
		//Output
		System.out.println("Answer: "+list2.size()+" so:");
		System.out.println(list2);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
