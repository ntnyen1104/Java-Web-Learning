package ss4_control_statements;

import java.util.Scanner;

public class Ex9UppercaseAndLowercaseLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự: ");
        char c = scanner.next().charAt(0);

        if (c >= 'A' && c <= 'Z' || c >= 'À' && c <= 'Ỹ') {
            c += 32;
            System.out.println("Ký tự sau khi chuyển đổi: " + c);
        } else if (c >= 'a' && c <= 'z') {
            c -= 32;
            System.out.println("Ký tự sau khi chuyển đổi: " + c);
        } else {
            System.out.println("Bạn đã nhập sai");
        }
    }
}
