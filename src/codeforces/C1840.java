package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C1840 {
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
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            int k = fastReader.nextInt();
            int q = fastReader.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fastReader.nextInt();
            }
            System.out.println(solve(n, k, q, a));
        }
    }

    public static long solve(int n, int k, int q, int[] a) {
        int tempLength = 0;
        long count = 0;
        for (int q0 : a) {
            if (q0 <= q) {
                tempLength++;
            } else {
                tempLength = 0;
            }
            if (tempLength >= k) {
                count += tempLength - k + 1;
            }
        }
        return count;
    }
}
