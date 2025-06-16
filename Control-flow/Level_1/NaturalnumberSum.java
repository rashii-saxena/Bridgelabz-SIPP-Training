package ControlFlowLevel_1;
import java .util.Scanner;

public class NaturalnumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter the number");
		int number = Scanner.nextInt();
		if (number >0) {
			int sum = number*(number + 1)/2;
			System.out.println("The "+number+" is natural number and the sum is " + sum );
		}
		else {
			System.out.print("the number is not natural number");
		}
		Scanner.close();

	}

}
