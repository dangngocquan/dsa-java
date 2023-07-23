package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1853 {
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
            int k = fastReader.nextInt() - 1;
            long upper = (long) n;
            long lower = (n + 1) / 2;
            int count = 0;
            for (long i = lower; i <= upper; i++) {
                if (check(n, i, k)) count++;
            }
            System.out.println(count);
        }
    }

    public static boolean check(int n, long x, int k) {
        long fn = n;
        long fn1 = x;
        long fn2 = fn-fn1;
        int tempIndex = k - 2;
        while (tempIndex > -1) {
            if (fn2 > fn1) return false;
            fn = fn1;
            fn1 = fn2;
            fn2 = fn - fn1;
            tempIndex--;
        }
        return true;
    }
}
