package ss4_control_statements;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex11Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");
            return;
        }

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return;
        }

        switch (month) {
            case 4, 6, 9, 11: {
                if (day == 31) System.out.println("Ngày không hợp lệ");
            }

        }

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leapYear) {
            if (month == 2 && day > 29) {
                System.out.println("Ngày không hợp lệ");
                return;
            } else if (month == 2 && day > 28) {
                System.out.println("Ngày không hợp lệ");
                return;
            }
        }

        // Tìm ngày trước đó
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;

        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
        }

        switch (previousMonth) {
            case 4, 6, 9, 11:
                previousDay = 30;
                break;
            case 2:
                if (leapYear) previousDay = 29;
                else previousDay = 28;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                previousDay = 30;
                break;

        }
        System.out.printf("Ngày trước đó: ngày %d tháng %d năm %d/n", previousDay, previousMonth, previousYear);

        // Tìm ngày sau đó
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;

        switch (nextMonth) {
            case 4, 6, 9, 11:
                if (nextDay > 31) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
            case 2:
                if ((leapYear && (nextDay > 29)) || (!leapYear && nextDay > 28)) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                if (nextDay > 30) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Ngày sau đó: ngày %d tháng %d năm %d", nextDay, nextMonth, nextYear);
    }


}
