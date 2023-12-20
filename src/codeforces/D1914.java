package codeforces;

import java.io.*;
import java.util.*;

public class D1914 {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int bufferPointer = 0;
        private int bytesRead = 0;

        public FastScanner(InputStream inputStream) {
            this.in = inputStream;
        }

        private void fillBuffer() throws IOException {
            bytesRead = in.read(buffer, bufferPointer = 0, buffer.length);
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        public int nextInt() throws IOException {
            int number = 0;
            byte c;
            // Skip non-digit characters
            do {
                c = read();
            } while (c <= ' ');
            // Read the number
            boolean isNegative = false;
            if (c == '-') {
                isNegative = true;
                c = read();
            }
            while (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
                c = read();
            }
            return isNegative ? -number : number;
        }

        public long nextLong() throws IOException {
            long num = 0;
            byte c = read();
            boolean negative = false;
            while (c <= ' ') {
                c = read();
            }
            if (c == '-') {
                negative = true;
                c = read();
            }
            while (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return negative ? -num : num;
        }

        public double nextDouble() throws IOException {
            int integerPart = nextInt();
            if (read() != '.') {
                return integerPart;
            }
            int fractionalPart = 0;
            int decimalDivisor = 1;

            while (true) {
                byte c = read();
                if (c < '0' || c > '9') {
                    break;
                }
                fractionalPart = fractionalPart * 10 + (c - '0');
                decimalDivisor *= 10;
            }
            return integerPart + (double) fractionalPart / decimalDivisor;
        }

        public String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c;
            // Skip leading whitespace characters
            do {
                c = read();
            } while (c <= ' ');
            // Read the string
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        public String nextLine() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c;
            while ((c = read()) != '\n' && c != '\r' && c != -1) {
                sb.append((char) c);
            }
            // Consume the newline characters if present (for both Unix and Windows line endings)
            if (c == '\r') {
                // Check if the next character is '\n' (Windows line ending)
                byte nextChar = read();
                if (nextChar != '\n') {
                    // If it's not '\n', we need to push it back to the buffer
                    bufferPointer--;
                }
            }
            return sb.toString();
        }
    }


    static class FastOutput {
        private BufferedWriter writer;
        public FastOutput(OutputStream outputStream) {
            this.writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        }

        public void print(Object obj) throws IOException {
            writer.write(obj.toString());
        }

        public void println(Object obj) throws IOException {
            writer.write(obj.toString());
            writer.newLine();
        }

        public void close() throws IOException {
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fastScanner = new FastScanner(System.in);
        FastOutput fastOutput = new FastOutput(System.out);
        int t = fastScanner.nextInt();
        while (t-- > 0) {
            int n = fastScanner.nextInt();
            TreeMap<Pair, Integer> treeA = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int x = fastScanner.nextInt();
                treeA.put(
                        new Pair(x, i),
                        x
                );
            }
            Pair[] a = new Pair[3];
            Iterator<Pair> iterator = treeA.keySet().iterator();
            int k = n - 3;
            while (k-- > 0) iterator.next();
            k = 0;
            while (k < 3) a[k++] = iterator.next();

            TreeMap<Pair, Integer> treeB = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int x = fastScanner.nextInt();
                treeB.put(
                        new Pair(x, i),
                        x
                );
            }
            Pair[] b = new Pair[3];
            iterator = treeB.keySet().iterator();
            k = n - 3;
            while (k-- > 0) iterator.next();
            k = 0;
            while (k < 3) b[k++] = iterator.next();

            TreeMap<Pair, Integer> treeC = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int x = fastScanner.nextInt();
                treeC.put(
                        new Pair(x, i),
                        x
                );
            }
            Pair[] c = new Pair[3];
            iterator = treeC.keySet().iterator();
            k = n - 3;
            while (k-- > 0) iterator.next();
            k = 0;
            while (k < 3) c[k++] = iterator.next();

            int ans = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (b[j].day == a[i].day) continue;
                    for (int m = 0; m < 3; m++) {
                        if (c[m].day == b[j].day || c[m].day == a[i].day) continue;
                        ans = Math.max(ans, a[i].value + b[j].value + c[m].value);
                    }
                }
            }
            System.out.println(ans);
        }
        fastOutput.close();
    }

    public static class Pair implements Comparable<Pair> {
        public int value, day;

        public Pair(int value, int day) {
            this.value = value;
            this.day = day;
        }

        @Override
        public int compareTo(Pair o) {
            if (o.value == value) {
                return day - o.day;
            }
            return value - o.value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return value == pair.value && day == pair.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, day);
        }
    }
}