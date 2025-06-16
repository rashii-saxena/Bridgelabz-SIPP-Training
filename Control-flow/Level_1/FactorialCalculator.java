package ControlFlowLevel_1;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Enter a positive number.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        }

        scanner.close();
    }
}
