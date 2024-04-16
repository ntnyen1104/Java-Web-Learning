package ss4_control_statements;

import java.util.Scanner;

public class Ex10SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();

        double squareRoot = Math.sqrt(number);

        if (squareRoot % 1 == 0) System.out.println(number + " là số chính phương");
        else System.out.println(number + " không phải số chính phương");
    }
}
