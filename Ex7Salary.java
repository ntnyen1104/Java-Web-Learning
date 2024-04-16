package ss4_control_statements;

import java.util.Scanner;

public class Ex7Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sal = 650000;

        System.out.print("Thâm niên công tác của bạn: ");
        double seniority = scanner.nextDouble();

        if (seniority < 12) System.out.println("Lương của bạn: " + sal * 1.92);
        else if (seniority >= 12 && seniority < 36) System.out.println("Lương của bạn: " + sal * 2.34);
        else if (seniority >= 36 && seniority < 60) System.out.println("Lương của bạn: " + sal * 3);
        else if (seniority >= 60) System.out.println("Lương của bạn: " + sal * 4.5);
    }
}
