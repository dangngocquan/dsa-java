package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1841 {
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
            int q = fastReader.nextInt();
            int[] x = new int[q];
            for (int i = 0; i < q; i++) {
                x[i] = fastReader.nextInt();
            }
            System.out.println(solve(x));
        }
    }

    public static String solve(int[] x) {
        StringBuilder s = new StringBuilder();
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        for (int element : x) {
            if (l1.size() == 0) {
                l1.add(element);
                s.append(1);
            } else {
                if (l2.size() == 0) {
                    if (element >= l1.get(l1.size()-1)) {
                        l1.add(element);
                        s.append(1);
                    } else if (element <= l1.get(0)){
                        l2.add(element);
                        s.append(1);
                    } else {
                        s.append(0);
                    }
                } else {
                    if (element >= l2.get(l2.size()-1) && element <= l1.get(0)) {
                        l2.add(element);
                        s.append(1);
                    } else {
                        s.append(0);
                    }
                }
            }
        }
        return s.toString();
    }
}
