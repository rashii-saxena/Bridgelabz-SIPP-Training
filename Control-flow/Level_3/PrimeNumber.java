package ControlFlowLevel_3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (>1): ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("Number should be greater than 1.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(num + (isPrime ? " is a Prime Number." : " is NOT a Prime Number."));
        }
        sc.close();
    }
}
