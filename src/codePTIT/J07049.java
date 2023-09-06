package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class J07049 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Product> products = new HashMap<>();
        TreeSet<Customer> customers = new TreeSet<>();
        String path = "MUAHANG.in";
        Scanner scanner = new Scanner(new File(path));


        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine());
            int monthsWarranty = Integer.parseInt(scanner.nextLine());
            Product product = new Product(
                    code, name, price, monthsWarranty
            );
            products.put(code, product);
        }


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            String code = String.format("KH%02d", i);
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            String productCode = scanner.nextLine();
            int quantity = Integer.parseInt(scanner.nextLine());
            LocalDateTime purchaseDate = LocalDateTime.parse(scanner.nextLine() + " 00:00", dateTimeFormatter);
            Customer customer = new Customer(
                    code,
                    name,
                    address,
                    products.get(productCode),
                    quantity,
                    purchaseDate
            );
            customers.add(customer);
        }

        scanner.close();

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    static class Product {
        private String code;
        private String name;
        private int price;
        private int monthsWarranty;

        public Product(String code, String name, int price, int monthsWarranty) {
            this.code = code;
            this.name = name;
            this.price = price;
            this.monthsWarranty = monthsWarranty;
        }

        public String getCode() {
            return code;
        }

        public int getPrice() {
            return price;
        }

        public int getMonthsWarranty() {
            return monthsWarranty;
        }
    }

    static class Customer implements Comparable {
        private String code;
        private String name;
        private String address;
        private Product product;
        private int quantity;
        private LocalDateTime purchaseDate;

        public Customer(String code, String name, String address, Product product, int quantity, LocalDateTime purchaseDate) {
            this.code = code;
            this.name = name;
            this.address = address;
            this.product = product;
            this.quantity = quantity;
            this.purchaseDate = purchaseDate;
        }

        public String getCode() {
            return code;
        }

        public Product getProduct() {
            return product;
        }

        public LocalDateTime getPurchaseDate() {
            return purchaseDate;
        }

        @Override
        public int compareTo(Object o) {
            Customer that = (Customer) o;
            LocalDateTime thisDateTime = this.getPurchaseDate().plusMonths(
                    this.getProduct().getMonthsWarranty()
            );
            LocalDateTime thatDateTime = that.getPurchaseDate().plusMonths(
                    that.getProduct().getMonthsWarranty()
            );
            if (thisDateTime.isBefore(thatDateTime)) {
                return -1;
            } else if (thisDateTime.isAfter(thatDateTime)) {
                return 1;
            } else {
                return this.code.compareTo(that.getCode());
            }
        }

        @Override
        public String toString() {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return String.format("%s %s %s %s %d %s",
                    this.code,
                    this.name,
                    this.address,
                    this.product.getCode(),
                    this.quantity * this.product.getPrice(),
                    this.purchaseDate.plusMonths(this.product.getMonthsWarranty()).format(dateTimeFormatter)
            );
        }
    }
}
