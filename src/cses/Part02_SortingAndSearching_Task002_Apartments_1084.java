package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 
 * @author Bris
 * @since 4:02:00 PM - Jan 26, 2023
 *
 */
public class Part02_SortingAndSearching_Task002_Apartments_1084 {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader scanner = new FastReader();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long k = scanner.nextLong();

		PriorityQueue<Long> applicants = new PriorityQueue<>();
		PriorityQueue<Long> apartments = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			applicants.add(scanner.nextLong());
		}

		for (int i = 0; i < m; i++) {
			apartments.add(scanner.nextLong());
		}

		long counter = 0;

		while (!applicants.isEmpty() && !apartments.isEmpty()) {
			long applicant = applicants.peek();
			long apartment = apartments.peek();
			if (Math.abs(applicant - apartment) <= k) {
				applicants.poll();
				apartments.poll();
				counter++;
			} else if (applicant < apartment) {
				applicants.poll();
			} else {
				apartments.poll();
			}
		}

		System.out.println(counter);
	}
}
