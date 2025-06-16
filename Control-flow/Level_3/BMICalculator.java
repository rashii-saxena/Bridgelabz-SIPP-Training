package ControlFlowLevel_3;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();

        double heightMeters = heightCm / 100;

        double bmi = weight / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        scanner.close();
    }
}
