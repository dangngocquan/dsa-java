package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class B1864 {
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
            int k = fastScanner.nextInt();
            char[] s = fastScanner.next().toCharArray();
            if (k% 2 == 0) {
                Arrays.sort(s);
                for (char e : s) fastOutput.print(e);
                fastOutput.println("");
            } else {
                if (n == 1) {
                    fastOutput.println(s[0]);
                    continue;
                }
                char[] s1 = new char[n - n/2];
                char[] s2 = new char[n/2];
                int i1 = 0;
                int i2 = 0;
                int i = 0;
                while (i < n) {
                    if (i1 < s1.length) {
                        s1[i1] = s[i];
                        i++;
                        i1++;
                    }
                    if (i2 < s2.length) {
                        s2[i2] = s[i];
                        i2++;
                        i++;
                    }
                }

                Arrays.sort(s1);
                Arrays.sort(s2);

                i1 = 0;
                i2 = 0;
                while (i1 < s1.length || i2 < s2.length) {
                    if (i1 < s1.length) {
                        fastOutput.print(s1[i1] + "");
                        i1++;
                    }
                    if (i2 < s2.length) {
                        fastOutput.print(s2[i2] + "");
                        i2++;
                    }
                }
                fastOutput.println("");
            }
        }
        fastOutput.close();
    }
}
