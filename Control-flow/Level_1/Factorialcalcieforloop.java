package ControlFlowLevel_1;
import java.util.Scanner;

public class Factorialcalcieforloop {
	public static void main(String args []) {
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter the number ");
		int n = Scanner.nextInt();
		if (n <0) {
			System.out.println("Enter the positive number ");		
	}
	else {
		int factorial = 1;
		for(int i=1; i <= n; i++) {
		factorial = factorial* i;
		}
		System.out.println("the factorial is "+ factorial);
	
	}
		Scanner.close();
	}
}



