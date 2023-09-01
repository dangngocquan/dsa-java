package codePTIT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TN02012 {
    public static int[][] coefficientSalary;
    public static Map<String, String> rooms;

    public static void main(String[] args) {
        coefficientSalary = new int[][] {
                {10, 12, 14, 20},
                {10, 11, 13, 16},
                {9, 10, 12, 14},
                {8, 9, 11, 13}
        };

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());
        rooms = new HashMap<String, String>();
        while (t-- > 0) {
            String[] data = scanner.nextLine().split(" ", 2);
            rooms.put(data[0], data[1]);
        }

        t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String customerCode = scanner.nextLine();
            String customerName = scanner.nextLine();
            int baseSalary = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            printInformations(customerCode,customerName, baseSalary, days);
        }

    }

    public static int getCoefficientSalary(String customerCode) {
        char typeCustomer = customerCode.charAt(0);
        int year = Integer.parseInt(customerCode.substring(1, 3));
        if (year >= 16) {
            return coefficientSalary[typeCustomer-'A'][3];
        }
        if (year >= 9) {
            return coefficientSalary[typeCustomer-'A'][2];
        }
        if (year >= 4) {
            return coefficientSalary[typeCustomer-'A'][1];
        }
        return coefficientSalary[typeCustomer-'A'][0];
    }

    public static void printInformations(
            String customerCode,
            String customerName,
            int baseSalary,
            int days) {
        String roomCode = customerCode.substring(3);
        String roomName = rooms.get(roomCode);
        int salary = getCoefficientSalary(customerCode) * baseSalary * days * 1000;
        System.out.printf("%s %s %s %d\n", customerCode, customerName, roomName, salary);
    }


}
