package codeforces;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1916 {
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
//            Queue<Long> evens = new LinkedList<>();
//            Queue<Long> odds = new LinkedList<>();
//            for (int i = 0; i < n; i++) {
//                long a = fastScanner.nextLong();
//                if (a%2 == 0) {
//                    evens.add(a);
//                } else {
//                    odds.add(a);
//                }
//            }
//            long turn = 0;
//            while (odds.size() + evens.size() > 1) {
//                if (turn % 2 == 0) {
//                    if (odds.size() >= 2) {
//                        evens.add((odds.poll() + odds.poll()) / 2 * 2);
//                    } else if (evens.size() >= 2) {
//                        evens.add((evens.poll() + evens.poll()) / 2 * 2);
//                    } else {
//                        evens.add((evens.poll() + odds.poll()) / 2 * 2);
//                    }
//                } else {
//                    if (odds.size() >= 1 && evens.size() >= 1) {
//                        evens.add((odds.poll() + evens.poll()) / 2 * 2);
//                    } else if (evens.size() > 0) {
//                        evens.add((evens.poll() + evens.poll()) / 2 * 2);
//                    } else {
//                        evens.add((odds.poll() + odds.poll()) / 2 * 2);
//                    }
//                }
//                turn++;
//            }
//            fastOutput.print();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = fastScanner.nextLong();
            long sum = 0;
            sum += a[0];
            fastOutput.print(a[0] + " ");
            int odd = 0;
            int even = 0;
            if (a[0] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            for (int i = 1; i < n; i++) {
                sum += a[i];
                if (a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                if (odd == 0) {
                    fastOutput.print(sum + " ");
                } else if (odd == 1) {
                    fastOutput.print((sum - 1) + " ");
                } else {
                    if (odd % 3 == 0) {
                        fastOutput.print((sum - odd / 3) + " ");
                    } else if (odd % 3 == 1) {
                        fastOutput.print((sum - odd / 3 - 1) + " ");
                    } else {
                        fastOutput.print((sum - odd / 3) + " ");
                    }
                }
            }
            fastOutput.println("");

        }
        fastOutput.close();
    }
}
