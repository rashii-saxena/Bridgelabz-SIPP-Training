package ControlFlowLevel_1;
import java.util.Scanner;

public class SumofNatural {
	public static void main(String args []) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter the number ");
		int n = Scanner.nextInt();
		if (n <=0 ) {
			System.out.print("The n is not natural number");
		}
		else {
			int sum = 0;
			int i = 1;
			while (i <= n ) {
				sum = sum +i;
				i++;
			}
			int sumformula = n*(n+1)/2;
			System.out.println("  The sum is  " + sum );
			System.out.println("the sum of sumformuale " + sumformula);
			if (sum == sumformula ) {
				System.out.println("the result is match , the comuptation is correct ");
			}
				else {
					System.out.println("the result doesn't match , the computation is incorrect ");
				}
			
			}
			
			Scanner.close();
			
		}
		
	}


