package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class J07047 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Room> rooms = new HashMap<>();
        TreeSet<Customer> customers = new TreeSet<>();

        String path = "DATA.in";
        Scanner scanner = new Scanner(new File(path));
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String[] line = scanner.nextLine().split(" ");
            String type = line[0];
            String name = line[1];
            int pricePerDay = Integer.parseInt(line[2]);
            double percentServicePrice = Double.parseDouble(line[3]);
            Room room = new Room(
                    type,
                    name,
                    pricePerDay,
                    percentServicePrice
            );

            rooms.put(type, room);
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            String code = String.format("KH%02d", i);
            String name = scanner.nextLine();
            String roomCode = scanner.nextLine();
            Room room = rooms.get(roomCode.charAt(2) + "");
            LocalDateTime dateBefore = LocalDateTime.parse(scanner.nextLine() + " 00:00", dateTimeFormatter);
            LocalDateTime dateAfter = LocalDateTime.parse(scanner.nextLine() + " 00:00", dateTimeFormatter);
            long numberDays = dateBefore.until(dateAfter, ChronoUnit.DAYS);
            long numberDays0 = numberDays > 0? numberDays : 1;
            double purchasePrice =
                    numberDays0 * (room.getPricePerDay() * (1+room.getPercentServicePrice()));
            if (numberDays0 < 10) {

            } else if (numberDays0 < 20) {
                purchasePrice *= 0.98;
            } else if (numberDays0 < 30) {
                purchasePrice *= 0.96;
            } else {
                purchasePrice *= 0.94;
            }

            Customer customer = new Customer(
                    code,
                    name,
                    roomCode,
                    room,
                    numberDays,
                    purchasePrice
            );

            customers.add(customer);
        }

        for (Customer customer : customers) System.out.println(customer);
    }

    static class Room {
        private String type;
        private String name;
        private int pricePerDay;
        private double percentServicePrice;

        public Room(String type, String name, int pricePerDay, double percentServicePrice) {
            this.type = type;
            this.name = name;
            this.pricePerDay = pricePerDay;
            this.percentServicePrice = percentServicePrice;
        }

        public int getPricePerDay() {
            return pricePerDay;
        }

        public double getPercentServicePrice() {
            return percentServicePrice;
        }
    }

    static class Customer implements Comparable {
        private String code;
        private String name;
        private String roomCode;
        private Room room;
        private long numberDays;
        private double purchasePrice;

        public Customer(String code, String name, String roomCode, Room room, long numberDays, double purchasePrice) {
            this.code = code;
            this.name = name;
            this.roomCode = roomCode;
            this.room = room;
            this.numberDays = numberDays;
            this.purchasePrice = purchasePrice;
        }


        public long getNumberDays() {
            return numberDays;
        }

        @Override
        public int compareTo(Object o) {
            Customer that = (Customer) o;
            return (int) (that.getNumberDays() - this.getNumberDays());
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %d %.2f",
                    code,
                    name,
                    roomCode,
                    numberDays,
                    Math.round(purchasePrice * 100) / 100.0);
        }
    }
}
