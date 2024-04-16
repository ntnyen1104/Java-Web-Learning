package ss4_control_statements;

import java.util.Scanner;

public class Ex4MinMaxNumberFirstWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " là số lớn nhất");
            System.out.println(b + " là số bé nhất");
        } else {
            System.out.println(a + " là số bé nhất");
            System.out.println(b + " là số lớn nhất");
        }
    }
}
