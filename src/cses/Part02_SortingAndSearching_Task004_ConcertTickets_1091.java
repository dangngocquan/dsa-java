package cses;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

public class Part02_SortingAndSearching_Task004_ConcertTickets_1091 {
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
        FastScanner fastReader = new FastScanner(System.in);
        FastOutput fastOutput = new FastOutput(System.out);

        int n = fastReader.nextInt();
        int m = fastReader.nextInt();

        TreeMap<Integer, Integer> tickets = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int price = fastReader.nextInt();
            if (tickets.containsKey(price)) {
                tickets.put(price, tickets.get(price) + 1);
            } else {
                tickets.put(price, 1);
            }
        }

        for (int i = 0; i < m; i++) {
            int value = fastReader.nextInt();
            Map.Entry<Integer, Integer> greatest = tickets.lowerEntry(value+1);
            if (greatest != null) {
                fastOutput.println(greatest.getKey());
                if (greatest.getValue() == 1) {
                    tickets.remove(greatest.getKey());
                } else {
                    tickets.put(greatest.getKey(), greatest.getValue() - 1);
                }
            } else {
                fastOutput.println("-1");
            }
        }

        fastOutput.close();
    }
}