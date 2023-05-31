package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F1807 {
    public static int countBounces;
    public static int n;
    public static int m;
    public static int i;
    public static int j;
    public static int i1;
    public static int j1;
    public static int i2;
    public static int j2;
    public static int[] d = new int[2];
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

    public static void solve() {
        boolean isFinish = false;
        int countI1J1 = 0;
        do {
            nextStep();
            if (i == i1 && j == j1) {
                countI1J1++;
            }
            isFinish = (countI1J1 > 4 || (i == i2 && j == j2));
        } while (!isFinish);
        if (i == i2 && j == j2) {
            System.out.println(countBounces);
        } else {
            System.out.println(-1);
        }
    }

    public static void nextStep() {
        int d0 = d[0];
        int d1 = d[1];
        if ((i + d[0]) == 0
                || (i + d[0]) == (n + 1)) {
            d[0] = 0 - d[0];
        }
        i += d[0];
        if ((j + d[1]) == 0
                || (j + d[1]) == (m + 1)) {
            d[1] = 0 - d[1];
        }
        j += d[1];
        if (d0 != d[0]) {
            countBounces++;
        }
        if (d1 != d[1]) {
            countBounces++;
        }
        if (d[0] != d0 && d[1] != d1) {
            countBounces--;
        }
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            countBounces = 0;
            n = fastReader.nextInt();
            m = fastReader.nextInt();
            i1 = fastReader.nextInt();
            j1 = fastReader.nextInt();
            i2 = fastReader.nextInt();
            j2 = fastReader.nextInt();
            String direction = fastReader.next();
            if (direction.charAt(0) == 'U') {
                d[0] = -1;
            } else {
                d[0] = 1;
            }
            if (direction.charAt(1) == 'L') {
                d[1] = -1;
            } else {
                d[1] = 1;
            }
            i = i1;
            j = j1;
            if (i1 == i2 && j1 == j2) {
                System.out.println(0);
                continue;
            }
            solve();
        }
    }
}
