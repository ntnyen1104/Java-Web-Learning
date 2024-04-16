package ss4_control_statements;

import java.util.Scanner;

/**
 * Bài tập chương câu lệnh điều kiện và rẽ nhánh
 * c.    Viết phương thức giải phương trình bậc hai.
 */

public class Ex5FirstDegreeEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextInt();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) System.out.println("phương trình vô số nghiệm.");
            else System.out.println("phương trinh vô nghiệm.");
        } else {
            double variable = -b / a;
            System.out.println("nghiệm của phương trình : " + variable);
        }

    }
}
