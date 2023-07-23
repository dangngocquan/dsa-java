package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1853 {
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
            boolean isSorted = true;
            int n = fastReader.nextInt();
            int[] a = new int[n];
            int minAbs = Integer.MAX_VALUE;
            a[0] = fastReader.nextInt();
            for (int i = 1; i < n; i++) {
                a[i] = fastReader.nextInt();
                if (a[i] < a[i-1]) {
                    isSorted = false;
                    continue;
                }
                if (minAbs > a[i] - a[i-1]) {
                    minAbs = a[i] - a[i-1];
                }
            }
            System.out.println((!isSorted)? 0 : (minAbs+2)/2);
        }
    }
}
