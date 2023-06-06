package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1840 {
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
            int k = fastReader.nextInt();
            System.out.println(count(n, k));
        }
    }

    public static long count(long n, int k) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        int k1 = 1;
        long tempValue = 1;
        while (tempValue <= n) {
            k1++;
            tempValue *= 2;
        }
        if (k <= k1-2) {
            return (long) Math.pow(2, k);
        }
        return tempValue/2 + count(n - tempValue/2, k);
    }
}
