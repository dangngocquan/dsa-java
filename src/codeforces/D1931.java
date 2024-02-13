package codeforces;

import java.io.*;
import java.util.*;

public class D1931 {
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
            long x = fastScanner.nextLong();
            long y = fastScanner.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = fastScanner.nextLong();
            Map<Long, List<Long>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long r = a[i] % y;
                if (!map.containsKey(r)) map.put(r, new LinkedList<>());
                map.get(r).add(a[i]);
            }
            long ans = 0;
            for (List<Long> list : map.values()) {
                Map<Long, List<Long>> map2 = new TreeMap<>();
                for (Long value : list) {
                    long r = value % x;
                    if (!map2.containsKey(r)) map2.put(r, new LinkedList<>());
                    map2.get(r).add(value);
                }
                for (Long key : map2.keySet()) {
                    if (key > (x / 2)) break;
                    long key1 = (x - key) % x;
                    if (!map2.containsKey(key1)) continue;
                    if (key == key1) {
                        ans += ((long) map2.get(key).size()) * ((long) map2.get(key1).size() - 1) / 2;
                    } else {
                        ans += ((long) map2.get(key).size()) * ((long) map2.get(key1).size());
                    }
                }
            }
            fastOutput.println(ans);
        }
        fastOutput.close();
    }
}
