package ControlFlowLevel_1;
import java.util.Scanner;

public class SumOfNaturalNoUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sum = 0;

 
            for (int i = 1; i <= n; i++) {
                sum =sum+ i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + sumFormula);
            
            if (sum == sumFormula) {
                System.out.println("✅ Both results match. Computation is correct.");
            } else {
                System.out.println("❌ The results do not match.");
            }
        }

        scanner.close();
    }
}
