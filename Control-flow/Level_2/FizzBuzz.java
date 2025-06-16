package ControlFlowLevel_2;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = Scanner.nextInt();
		if (number <=0) {
			System.out.println ("yes number is positive ");
		}
		else {
			for(int i =1; i <= number ; i++) {
				if (i  % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				}
				else if (i % 3 == 0 ) {
					System.out.println("Fizz");
				}
				else if (i  % 5 == 0 ) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
		}	
		Scanner.close();
	}
}



