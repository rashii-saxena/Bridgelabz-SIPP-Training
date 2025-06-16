package ControlFlowLevel_1;
import java.util.Scanner;

	public class MultiplebelowHundreadwhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive number less than 100: ");
	        int number = scanner.nextInt();

	        if (number <= 0 || number >= 100) {
	            System.out.println("Invalid input. Please enter a positive number less than 100.");
	        } else {
	            System.out.println("Multiples of " + number + " below 100:");
	            int i = 100;
	            while (i >= 1) {
	                if (i % number == 0) {
	                    System.out.println(i);
	                }
	                i--;
	            }
	        }

	        scanner.close();
	    }
	}
