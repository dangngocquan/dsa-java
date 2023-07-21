package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class F1850 {
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
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            Map<Integer, Integer> m = new HashMap<>();

            int[] count = new int[n+1];
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a > n) continue;
                if (m.containsKey(a)) {
                    m.put(a, m.get(a) + 1);
                } else {
                    m.put(a, 1);
                }
            }

            for (int key : m.keySet()) {
                for (int j = 1; j*key <= n; j++) {
                    count[j*key] += m.get(key);
                }
            }

            int maxCount = 0;
            for (int value : count) {
                if (maxCount < value) maxCount = value;
            }
            System.out.println(maxCount);
        }
    }
}
