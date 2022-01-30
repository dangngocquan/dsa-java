//Viết chương trình liệt kê tất cả các xâu nhị phân độ dài n.

package chap001.exe;

import java.util.*;

public class exe_0009 {
	public static void main(String[] args) {
		//Input
		System.out.println("Liet ke tat ca cac xau nhi phan do dai n ...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so n (n>0):\t");
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		Queue<String> queue = new LinkedList<String>();
		queue.offer("");
		for (int i = 0; i <= n-1; i++) {
			long count = (long)Math.pow(2,i);
			for (long j = 1; j<= count; j++) {
				String x = queue.poll();
				queue.offer(x+"0");
				queue.offer(x+"1");
			}
		}
		//Output
		System.out.println(queue);
		System.out.println("Count:\t"+queue.size());
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
