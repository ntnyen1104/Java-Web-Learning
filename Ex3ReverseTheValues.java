package ss4_control_statements;

import java.util.Scanner;

public class Ex3ReverseTheValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị biến a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị biến b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Giá trị a và b sau khi đảo");
        System.out.println("Giá trị a = " + a);
        System.out.println("Giá trị b = " + b);
    }
}
