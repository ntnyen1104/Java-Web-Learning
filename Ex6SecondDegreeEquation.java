package ss4_control_statements;

import java.util.Scanner;

public class Ex6SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextInt();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextInt();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("phương trình vô số nghiệm.");
                else System.out.println("phương trinh vô nghiệm.");
            } else {
                double variable = -b / c;

                System.out.println("nghiệm của phương trình : " + variable);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) System.out.println("phương trình vô nghiệm.");
            else if (delta == 0) System.out.println("phương trình có duy nhất 1 nghiệm: " + -b / 2 * a);
            else {
                System.out.println("phương trình có 2 nghiệm ");
                System.out.println("x1 = " + (-b - Math.sqrt(delta) / (2 * a)));
                System.out.println("x2 = " + (-b + Math.sqrt(delta) / (2 * a)));
            }
        }

    }
}
