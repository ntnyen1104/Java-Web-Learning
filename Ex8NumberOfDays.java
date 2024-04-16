package ss4_control_statements;

import java.util.Scanner;

public class Ex8NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("Tháng %d năm %d có 31 ngày", month, year);
                break;
            case 4, 6, 9, 11:
                System.out.printf("Tháng %d năm %d có 30 ngày", month, year);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    System.out.printf("Tháng 2 năm %d có 29 ngày", year);
                else {
                    System.out.printf("Tháng 2 năm %d có 28 ngày", year);
                }
        }
    }
}
