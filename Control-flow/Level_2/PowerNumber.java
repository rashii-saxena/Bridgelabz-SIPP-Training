package ControlFlowLevel_2;

	import java.util.Scanner;

	public class PowerNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the base number (positive integer): ");
	        int number = scanner.nextInt();

	        System.out.print("Enter the power (positive integer): ");
	        int power = scanner.nextInt();

	      
	        if (number < 0 || power < 0) {
	            System.out.println("Please enter only positive integers.");
	        } else {
	            int result = 1;
	            int i = 1;

	            while (i <= power) {
	                result *= number;
	                i++;
	            }

	   
	            System.out.println(number + " ^ " + power + " = " + result);
	        }

	        scanner.close();
	    }
	}
