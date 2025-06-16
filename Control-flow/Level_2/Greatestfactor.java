package ControlFlowLevel_2;

import java.util.Scanner;

public class Greatestfactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int greatestFactor = 1;
            int counter = number - 1;

            
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; 
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        scanner.close();
    }
}

