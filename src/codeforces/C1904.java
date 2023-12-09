package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.TreeSet;

public class C1904 {
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
            long k = fastScanner.nextLong();
            long[] a = new long[n];
            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = fastScanner.nextLong();
                set.add(a[i]);
            }
            if (set.size() != n) {
                fastOutput.println("0");
            } else {
                if (k > 2) {
                    fastOutput.println("0");
                    continue;
                }
                Arrays.sort(a);
                if (k == 2) {
                    long min = a[0];
                    for (int i = 0; i < n-1; i++) {
                        for (int j = i+1; j < n; j++) {
                            long e = a[j] - a[i];
                            if (set.contains(e)) {
                                min = 0;
                                break;
                            }
                            min = Math.min(e, min);
                            Long e1 = set.lower(e);
                            Long e2 = set.higher(e);
                            if (e1 != null) min = Math.min(min, e - e1);
                            if (e2 != null) min = Math.min(min, e2 - e);
                        }
                        if (min == 0) break;
                    }
                    fastOutput.println(min);
                    continue;
                }
                long min = a[0];
                for (int i = 1; i < n; i++) {
                    min = Math.min(a[i] - a[i-1], min);
                }
                fastOutput.println(min);
            }
        }
        fastOutput.close();
    }
}
