package ControlFlowLevel_1;
import java.util.Scanner;

public class Smallestof3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Yes, the first number is the smallest.");
        } else {
            System.out.println("No, the first number is not the smallest.");
        }

        scanner.close();
    }
}

