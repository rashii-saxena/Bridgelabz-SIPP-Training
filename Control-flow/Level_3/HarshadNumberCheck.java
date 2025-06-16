package ControlFlowLevel_3;
import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number; 
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;            
            number = number / 10;   
        }

    
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        scanner.close();
    }
}
