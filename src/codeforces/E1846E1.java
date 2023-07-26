package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E1846E1 {
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
            long n = fastReader.nextLong();
            System.out.println(solve(n));
        }
    }

    public static String solve(long n) {
        // 1 + k + k^2 + ... >= 7
        if (n < 7) return "NO";

        // 1 + k + k^2 + ... + k^m = (k^(m+1) - 1) / (k-1) = n

        long k = Math.round(Math.sqrt(n)); // kMax
        while (n < k*k + k + 1) k--;

        while (k > 1) {
            long x = n * (k-1) + 1;
            while (x % k == 0) {
                x /= k;
            }
            if (x == 1) return "YES";
            k--;
        }

        return "NO";
    }
}

