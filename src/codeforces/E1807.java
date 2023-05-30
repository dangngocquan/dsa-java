package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E1807 {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            long[] dp = new long[n+1];
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i-1] + fastReader.nextLong();
            }
            find(dp, 1, n, fastReader);
        }
    }

    public static void find(long[] dp, int l, int r, FastReader fastReader) {
        if (l == r) {
            System.out.println("! " + l);
            return;
        }

        int k = (r - l + 1) / 2;
        System.out.print("? " + k);
        for (int i = l; i < l + k; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.flush();

        long sum = fastReader.nextLong();

        if (sum == (dp[l+k-1] - dp[l-1])) {
            find(dp, l+k, r, fastReader);
        } else {
            find(dp, l, l+k-1, fastReader);
        }

    }

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
}
